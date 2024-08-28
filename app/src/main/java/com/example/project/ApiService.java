package com.example.project;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiService {

    private static final String SERVER_URL = "https://mentalhealthchatbotserver.onrender.com/chat";

    public void sendMessage(String message, ApiCallback callback) {
        new SendMessageTask(message, callback).execute();
    }

    private static class SendMessageTask extends AsyncTask<Void, Void, String> {
        private String message;
        private ApiCallback callback;

        SendMessageTask(String message, ApiCallback callback) {
            this.message = message;
            this.callback = callback;
        }

        @Override
        protected String doInBackground(Void... voids) {
            try {
                URL url = new URL(SERVER_URL);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setDoOutput(true);

                OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
                writer.write("{\"message\":\"" + message + "\"}");
                writer.flush();

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder result = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                }
                reader.close();
                return result.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(String result) {
            if (callback != null) {
                callback.onResponse(result);
            }
        }
    }

    public interface ApiCallback {
        void onResponse(String response);
    }
}