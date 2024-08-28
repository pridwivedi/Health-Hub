package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextLoginEmail, editTextLoginPwd;
    private ProgressBar progressBar;
    private FirebaseAuth authProfile;
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_login );

        // set the Title
      // getSupportActionBar ().setTitle ( "Login" );

        editTextLoginEmail = findViewById ( R.id.editText_login_email );
        editTextLoginPwd = findViewById ( R.id.editText_login_pwd );
       progressBar = findViewById ( R.id.progressBar );

       // Authentication verification
        authProfile = FirebaseAuth.getInstance ();

        // Hide Password using Eye Icon
        ImageView imageViewShowHidePwd = findViewById (R.id.imageView_show_hide_pwd);
        imageViewShowHidePwd.setImageResource ( R.drawable.ic_hide_pwd );
        imageViewShowHidePwd.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if (editTextLoginPwd.getTransformationMethod ().equals (HideReturnsTransformationMethod.getInstance())) {
                
                    // if password is visible the Hide it...
                    editTextLoginPwd.setTransformationMethod ( PasswordTransformationMethod.getInstance ( ) );
                    // Change icons
                    imageViewShowHidePwd.setImageResource ( R.drawable.ic_hide_pwd );
                } else {
                    editTextLoginPwd.setTransformationMethod (HideReturnsTransformationMethod.getInstance ());
                    imageViewShowHidePwd.setImageResource (R.drawable.ic_show_pwd);
                }
            }
        } );



        // Login user
        Button buttonLogin = findViewById ( R.id.button_login );
        buttonLogin.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String textEmail = editTextLoginEmail.getText ().toString ();
                String textPwD = editTextLoginPwd.getText ().toString ();

                if(TextUtils.isEmpty (textEmail)){
                    Toast.makeText (LoginActivity.this,"Please enter your email",Toast.LENGTH_LONG).show ();
                    editTextLoginEmail.setError ("Email is required");
                    editTextLoginEmail.requestFocus ();
                } else if (!Patterns.EMAIL_ADDRESS.matcher (textEmail).matches ()) {
                    Toast.makeText ( LoginActivity.this,"Please re-enter your email",Toast.LENGTH_LONG ).show ();
                    editTextLoginEmail.setError ("Valid email is required");
                    editTextLoginEmail.requestFocus ();
                } else if (TextUtils.isEmpty ( textPwD )) {
                    Toast.makeText (LoginActivity.this,"Please enter your Password",Toast.LENGTH_LONG).show ();
                    editTextLoginPwd.setError ("Password is required");
                    editTextLoginPwd.requestFocus ();
                }
                else{
                    progressBar.setVisibility ( View.VISIBLE );
                    loginUser(textEmail, textPwD);
                }
            }
        } );

    }

    protected void onStart(){
        super.onStart ();
        if(authProfile.getCurrentUser () != null){
            Toast.makeText ( LoginActivity.this, "You are already Logged In", Toast.LENGTH_SHORT).show ();
            Intent intent = (new Intent(LoginActivity.this, HomePage.class) );
            startActivity ( intent );
            finish ();
        }
        else{
            Toast.makeText ( LoginActivity.this, "You can Login now!", Toast.LENGTH_SHORT).show ();
        }
    }

    private void loginUser(String email, String pwd) {
        authProfile.signInWithEmailAndPassword (email, pwd).addOnCompleteListener ( new OnCompleteListener<AuthResult> ( ) {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful ()){
                    Toast.makeText (LoginActivity.this,"Login Successfully",Toast.LENGTH_LONG).show ();

                   // if email and password are correct then go to Home page
               Intent intent = (new Intent(LoginActivity.this, HomePage.class) );
               startActivity ( intent );
               finish ();

                }
                else {
                    try {
                        throw task.getException();
                    } catch (FirebaseAuthInvalidUserException e) {
                        editTextLoginEmail.setError ( "User does not exist or its no longer Valid. Please Register again" );
                        editTextLoginEmail.requestFocus ( );

                         } catch (FirebaseAuthInvalidCredentialsException e){   // if email and password do not match
                        editTextLoginEmail.setError ("invalid User. Kindly, check and re-enter email / password");
                        editTextLoginEmail.requestFocus ();
                    }  catch (Exception e){
                        Log.e(TAG, e.getMessage ());
                        Toast.makeText ( LoginActivity.this, e.getMessage () , Toast.LENGTH_LONG ).show ( );
                    }
                }
                progressBar.setVisibility (View.GONE);
            }
        } );
    }
}