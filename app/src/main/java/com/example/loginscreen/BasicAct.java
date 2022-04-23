package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class BasicAct extends AppCompatActivity {

    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic2);

        textView = findViewById(R.id.textView);

        sp = getSharedPreferences("sign", MODE_PRIVATE);
        editor = sp.edit();

        String username = sp.getString("username", "Empty String !");
        String password = sp.getString("password", "Empty Password ! ");

        textView.setText("Username is : " + username
         + "\nPassword is : " + password);

    }
}