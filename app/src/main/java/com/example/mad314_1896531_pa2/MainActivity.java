package com.example.mad314_1896531_pa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText etUsername, etPassword;
TextView txtInvalidCredential;
String username = "admin";
String password = "admin123";
Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = (EditText)findViewById(R.id.etUserName);
        etPassword = (EditText)findViewById(R.id.etPassword);
        txtInvalidCredential = (TextView) findViewById(R.id.txtInvalid);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etUsernameText = etUsername.getText().toString();
                String etPasswordText = etPassword.getText().toString();
                if(etUsernameText.equals(username) && etPasswordText.equals(password)){
                    Intent i = new Intent(getApplicationContext(),StudentList.class);
                    i.putExtra("user",etUsernameText);
                    i.putExtra("password",etPasswordText);
                    startActivity(i);
                }else{
                    txtInvalidCredential.setText("Invalid Username or Password!");
                }
            }
        });
    }
}
