package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_home_page );




//        SharedPreferences sharedPreferences = getSharedPreferences ( "shared_prefs", Context.MODE_PRIVATE );
//        String username = sharedPreferences.getString ( "username","" ).toString ();
//        Toast.makeText ( getApplicationContext (),"Welcome"+ username, Toast.LENGTH_SHORT ).show ();


        // First- Aid Module

        view = findViewById(R.id.rectangle_2);
        view.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Log.d ( "Rectangle2","OnClickRectangle2");
                Intent intent=new Intent ( HomePage.this, MainActivity2.class );
                Log.d ( "Rectangle2","OnClick intent created");
                startActivity ( intent );
                Log.d ( "Rectangle2","OnClickStartMainActivity2");
                 finish ();
                Log.d ( "Rectangle2","OnClickIntentFinish");

            }
        } );



      //  Mental Wellbeing Module

        view =(View) findViewById(R.id.rectangle_3);
        view.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( HomePage.this, Mental_Wellbeing.class );
                startActivity ( intent );
            }
        } );





        // Reminder Module

        view =(View) findViewById(R.id.rectangle_4);
        view.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( HomePage.this, ReminderSplashScreen.class );
                startActivity ( intent );
            }
        } );





        //Record Manager Module

        view =(View) findViewById(R.id.rectangle_5);
        view.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( HomePage.this, Record_Manager.class );
                startActivity ( intent );
                finish ();
            }
        } );




        // Map Module

//        view =(View) findViewById(R.id.rectangle_6);
//        view.setOnClickListener ( new View.OnClickListener ( ) {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent ( HomePage.this, Map.class );
//                startActivity ( intent );
//            }
//        } );



    }
}