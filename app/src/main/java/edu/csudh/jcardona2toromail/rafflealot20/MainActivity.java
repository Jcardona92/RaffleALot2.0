package edu.csudh.jcardona2toromail.rafflealot20;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername , editTextpassword;
    private Button Submit ,buttonRegister;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = (EditText) findViewById(R.id.userid_login);
        editTextpassword = (EditText) findViewById(R.id.PWD_login);

        buttonRegister = (Button) findViewById(R.id.button_register);
        Submit = (Button) findViewById(R.id.button_login);

        progressDialog = new ProgressDialog(this);
        LoginActionButton();
        actionButton();



    }

    public void onLogin(View view){
        String username = editTextUsername.getText().toString();
        String password = editTextpassword.getText().toString();
        String type = "login";

        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(type,username,password);

    }
    public void actionButton(){
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    public void LoginActionButton(){
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,UserAreaActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view){
        if(view ==buttonRegister){

        }
    }
}
