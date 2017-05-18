package edu.csudh.jcardona2toromail.rafflealot20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText editTextUsername , editTextpassword, editTextemial;
    private Button Bregister;
    private  String Username , Password , Email;

    public RegisterActivity(String username, String password, String email){
        this.Username = username;
        this.Password = password ;
        this.Email = email;
    }

    public EditText getEditTextUsername() {
        return editTextUsername;
    }

    public EditText getEditTextpassword() {
        return editTextpassword;
    }

    public EditText getEditTextemial() {
        return editTextemial;
    }

    public Button getBregister() {
        return Bregister;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEditTextUsername(EditText editTextUsername) {
        this.editTextUsername = editTextUsername;
    }

    public void setEditTextpassword(EditText editTextpassword) {
        this.editTextpassword = editTextpassword;
    }

    public void setEditTextemial(EditText editTextemial) {
        this.editTextemial = editTextemial;
    }

    public void setBregister(Button bregister) {
        Bregister = bregister;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "RegisterActivity{" +
                "editTextUsername=" + editTextUsername +
                ", editTextpassword=" + editTextpassword +
                ", editTextemial=" + editTextemial +
                ", Bregister=" + Bregister +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Bregister = (Button) findViewById(R.id.Button_Register);
            ActionToUSerArea();


    }

    public void ActionToUSerArea(){
        Bregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,UserAreaActivity.class);
                startActivity(intent);
            }
        });
    }
}
