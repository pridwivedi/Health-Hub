package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView t;
    TextView t1;
    String tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t = findViewById(R.id.textView3);
        t1 = findViewById(R.id.textView4);
        tex = getIntent().getStringExtra("ans");

        if (tex != null) {
            // Display the received string for debugging purposes
            t.setText(tex);

            // Remove any leading/trailing spaces to avoid mismatches
            tex = tex.trim();

            String message;
            switch (tex) {
                case "ALLERGIC REACTION":
                    message = getString(R.string.app1);
                    break;
                case "ASTHMA ATTACK":
                    message = getString(R.string.app2);
                    break;
                case "BURNS":
                    message = getString(R.string.app3);
                    break;
                case "CUTS AND SCRAPES":
                    message = getString(R.string.app4);
                    break;
                case "CHOKING":
                    message = getString(R.string.app5);
                    break;
                case "DEHYDRATION":
                    message = getString(R.string.app6);
                    break;
                case "DROWNING":
                    message = getString(R.string.app7);
                    break;
                case "ELECTRIC SHOCK":
                    message = getString(R.string.app8);
                    break;
                case "FAINTING":
                    message = getString(R.string.app9);
                    break;
                case "FRACTURES":
                    message = getString(R.string.app10);
                    break;
                case "HEAT STROKE":
                    message = getString(R.string.app11);
                    break;
                case "HEART ATTACK":
                    message = getString(R.string.app12);
                    break;
                case "HEAD INJURIES":
                    message = getString(R.string.app13);
                    break;
                case "INSECT BITES":
                    message = getString(R.string.app14);
                    break;
                case "POISONING":
                    message = getString(R.string.app15);
                    break;
                case "PUNCTURE WOUND":
                    message = getString(R.string.app16);
                    break;
                case "RIB FRACTURE":
                    message = getString(R.string.app17);
                    break;
                case "SPRAINS AND STRAINS":
                    message = getString(R.string.app18);
                    break;
                case "SNAKE BITES":
                    message = getString(R.string.app19);
                    break;
                case "TENDON RUPTURE":
                    message = getString(R.string.app20);
                    break;
                default:
                    message = "No message available"; // Default case when no match is found
                    break;
            }
            t1.setText(message);
        } else {
            t.setText("No message available");
        }
    }
}
