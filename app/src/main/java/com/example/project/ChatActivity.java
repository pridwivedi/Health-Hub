package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import org.json.JSONObject;

public class ChatActivity extends AppCompatActivity {

    private EditText messageEditText;
    private LinearLayout chatLayout;
    private ApiService apiService;
    private ScrollView chatScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_chat );


        messageEditText = findViewById(R.id.messageEditText);
        chatLayout = findViewById(R.id.chatLayout);
        chatScrollView = findViewById(R.id.chatScrollView);
        Button sendButton = findViewById(R.id.sendButton);

        apiService = new ApiService();

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageEditText.getText().toString();
                addMessageToLayout("YOU:  " + message, true);

                apiService.sendMessage(message, new ApiService.ApiCallback() {
                    @Override
                    public void onResponse(String response) {
                        if (response != null) {
                            try {
                                // Parse the response JSON and extract the message
                                JSONObject jsonResponse = new JSONObject(response);
                                String botMessage = jsonResponse.optString("response", "No response from bot");
                                addMessageToLayout("BOT:  " + botMessage, false);
                            } catch (Exception e) {
                                e.printStackTrace();
                                addMessageToLayout("BOT: Error parsing response", false);
                            }
                        } else {
                            addMessageToLayout("BOT: No response from server", false);
                        }
                    }
                });

                messageEditText.setText("");
            }
        });
    }

    private void addMessageToLayout(String message, boolean isUser) {
        TextView textView = new TextView(this);
        textView.setText(message);
        textView.setTextColor(getResources().getColor(android.R.color.black)); // Set text color to black
        textView.setTextSize(15.0f);  //set text size
        textView.setBackgroundResource(isUser ? R.drawable.semi_circular_background : R.drawable.semicircular_bot_message);
        textView.setPadding(20, 25, 20, 25); // Add padding to avoid touching the border

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(8, 8, 8, 8);
        textView.setLayoutParams(params);

        chatLayout.addView(textView);
        chatScrollView.post(() -> chatScrollView.fullScroll(View.FOCUS_DOWN));
    }
}