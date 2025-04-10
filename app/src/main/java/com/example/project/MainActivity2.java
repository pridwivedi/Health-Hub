package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {
    CardView card1;
    CardView chip2;
    CardView chip3;
    CardView chip4;
    CardView chip5;
    CardView chip6;
    CardView chip7;
    CardView chip8;
    CardView chip9;
    CardView chip10;
    CardView chip11;
    CardView chip12;
    CardView chip13;
    CardView chip14;
    CardView chip15;
    CardView chip16;
    CardView chip17;
    CardView chip18;
    CardView chip19;
    CardView chip20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d ( "Rectangle2","In sideOnCreate M2");
        super.onCreate ( savedInstanceState );
        Log.d ( "Rectangle2","In sideOnCreate after superInvoke M2");
        setContentView ( R.layout.activity_main2 );
        Log.d ( "Rectangle2","In OnCreate after set Content MainActivit2 ");



        card1=findViewById(R.id.chip1);
        chip2=findViewById(R.id.chip2);
        chip3=findViewById(R.id.chip3);
        chip4=findViewById(R.id.chip4);
        chip5=findViewById(R.id.chip5);
        chip6=findViewById(R.id.chip6);
        chip7=findViewById(R.id.chip7);
        chip8=findViewById(R.id.chip8);
        chip9=findViewById(R.id.chip9);
        chip10=findViewById(R.id.chip10);
        chip11=findViewById(R.id.chip11);
        chip12=findViewById(R.id.chip12);
        chip13=findViewById(R.id.chip13);
        chip14=findViewById(R.id.chip14);
        chip15=findViewById(R.id.chip15);
        chip16=findViewById(R.id.chip16);
        chip17=findViewById(R.id.chip17);
        chip18=findViewById(R.id.chip18);
        chip19=findViewById(R.id.chip19);
        chip20=findViewById(R.id.chip20);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();

                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
              intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();

                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
               intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
              intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
               intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();

             Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
               intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();

                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();

                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();

                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });

        chip20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)  ((CardView) view).getChildAt(0);
                CharSequence text = textView.getText();
                Toast.makeText(MainActivity2.this,text, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("ans",text);
                startActivity(intent);
            }
        });
    }
}


//
//package com.example.project;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.cardview.widget.CardView;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class MainActivity2 extends AppCompatActivity {
//    CardView[] cards = new CardView[20]; // Array to hold card references
//    String[] cardIds = {
//            "chip1", "chip2", "chip3", "chip4", "chip5", "chip6",
//            "chip7", "chip8", "chip9", "chip10", "chip11", "chip12",
//            "chip13", "chip14", "chip15", "chip16", "chip17", "chip18",
//            "chip19", "chip20" // All IDs for the chips
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        Log.d("Rectangle2", "Inside onCreate M2");
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//        Log.d("Rectangle2", "After setContentView in MainActivity2");
//
//        // Initialize CardView array and set up click listeners
//        for (int i = 0; i < cards.length; i++) {
//            int resID = getResources().getIdentifier(cardIds[i], "id", getPackageName());
//            cards[i] = findViewById(resID);
//            final int index = i; // Final variable for the click listener
//
//            cards[i].setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    // Get the TextView inside the clicked CardView
//                    TextView textView = (TextView) ((CardView) view).getChildAt(0);
//                    // Retrieve the text from the TextView
//                    CharSequence text = textView.getText();
//                    // Show a Toast with the retrieved text
//                    Toast.makeText(MainActivity2.this, text, Toast.LENGTH_SHORT).show();
//
//                    // Start the next activity and pass the text
//                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
//                    intent.putExtra("ans", text);
//                    startActivity(intent);
//                }
//            });
//        }
//    }
//}
