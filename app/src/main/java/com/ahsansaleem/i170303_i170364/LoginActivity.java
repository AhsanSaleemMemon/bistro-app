package com.ahsansaleem.i170303_i170364;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView sign_up;
    Button log_in_btn;

    EditText email_input;
    EditText password_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        log_in_btn=findViewById(R.id.login_btn);
        sign_up = findViewById(R.id.sign_up_page);

        email_input = findViewById(R.id.email_input);
        password_input = findViewById(R.id.pass_input);

        String[] emails = {"ahsanmemon288@gmail.com", "aqeelejaz238@gmail.com", "anonymous123@gmail.com"};
        String[] passwords = {"user123", "user456", "user678"};

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        log_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

//    private static boolean isEmpty()


}