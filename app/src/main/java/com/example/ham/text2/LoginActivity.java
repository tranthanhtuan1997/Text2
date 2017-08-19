package com.example.ham.text2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private final String USERNAME = "ito";
    private final String PASSWORD = "ito";

    private EditText Pass, User;
    private Button LOGIN;
    private  String pass,user;
    private TextView Forgot,Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        Log.e("LOGIN","onCreate");
        finish();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("LOGIN","onStart");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("LOGIN","onRestart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("LOGIN","onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("LOGIN","onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("LOGIN","onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("LOGIN","onDestroy");
    }

    private void initView(){
        User =(EditText) findViewById(R.id.eUser);
        Pass = (EditText) findViewById(R.id.ePass);
        LOGIN = (Button) findViewById(R.id.eLogin);
        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
                noti(check());
                if (check()){
                    Intent s = new Intent(LoginActivity.this,ZodiacActivity.class);
                    startActivity(s);
                }
            }
        });
        Forgot=(TextView) findViewById(R.id.eForgot);
        Forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,ForgotActivity.class);
                startActivity(intent);
            }
        });
        Register=(TextView) findViewById(R.id.eRegister);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(t);
            }
        });
    }


    private void getData(){
        user = User.getText().toString();
        pass=Pass.getText().toString();
    }

    private boolean check(){
        if (user.equalsIgnoreCase(USERNAME) && pass.equalsIgnoreCase(PASSWORD))
            return true;
        return false;
    }

    private void noti(boolean isSuccessful){
        if (isSuccessful)
            Toast.makeText(this, "Login successful!",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"login fail. Don't cry baby!",Toast.LENGTH_SHORT).show();
    }
}
