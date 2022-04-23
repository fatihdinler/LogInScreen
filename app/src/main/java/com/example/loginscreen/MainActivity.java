package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editTextUsername, editTextPassword;
    private Button button;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.textInputUsername);
        editTextPassword = findViewById(R.id.textInputPassword);
        button = findViewById(R.id.button);


        sp = getSharedPreferences("sign", MODE_PRIVATE);
        editor = sp.edit();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("username", editTextUsername.getText().toString());
                editor.putString("password", editTextPassword.getText().toString());
                editor.commit();

                startActivity(new Intent(MainActivity.this, BasicAct.class));

            }
        });
    }
}