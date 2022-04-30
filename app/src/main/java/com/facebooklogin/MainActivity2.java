package com.facebooklogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        EditText name = findViewById(R.id.name1);
        EditText email = findViewById(R.id.email1);
        EditText phone = findViewById(R.id.phone1);
        EditText al_name = findViewById(R.id.al_name1);
        EditText al_email = findViewById(R.id.al_email1);
        EditText al_phone = findViewById(R.id.al_phone1);
        Button submit = findViewById(R.id.submit);
        TextInputLayout name_l = findViewById(R.id.name);
        TextInputLayout email_l = findViewById(R.id.email);
        TextInputLayout phone_l = findViewById(R.id.phone);
        TextInputLayout alname_l = findViewById(R.id.al_name);
        TextInputLayout alemail_l = findViewById(R.id.al_email);
        TextInputLayout alphone_l = findViewById(R.id.al_phone);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name_val = name.getText().toString().trim();
                String email_val = email.getText().toString().trim();
                String phone_val = phone.getText().toString().trim();
                String alname_val = al_name.getText().toString().trim();
                String alemail_val = al_email.getText().toString().trim();
                String alphone_val = al_phone.getText().toString().trim();

                if (name_val.isEmpty()) {
                    name_l.setError("enter your name please.."); }
                else {
                    name_l.setErrorEnabled(false); }
                if (email_val.isEmpty()) {
                    email_l.setError("enter your email please.."); }
                else if (!Patterns.EMAIL_ADDRESS.matcher(email_val).matches()) {
                    email_l.setError("enter a valid email adress please.."); }
                else {
                    email_l.setErrorEnabled(false); }

                if (phone_val.isEmpty()) {
                    phone_l.setError("enter your phone number please.."); }
                else {
                    phone_l.setErrorEnabled(false); }

                if (alname_val.isEmpty()) {
                    alname_l.setError("enter a name please.."); }
                else {
                    alname_l.setErrorEnabled(false); }
                if (alemail_val.isEmpty()) {
                    alemail_l.setError("enter the email please.."); }
                else if (!Patterns.EMAIL_ADDRESS.matcher(alemail_val).matches()) {
                    alemail_l.setError("enter a valid email adress please.."); }
                else {
                    alemail_l.setErrorEnabled(false); }

                if (alphone_val.isEmpty()) {
                    alphone_l.setError("enter the phone number please.."); }
                else {
                    alphone_l.setErrorEnabled(false); }

                if (!name_val.isEmpty() && !email_val.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email_val).matches() && !phone_val.isEmpty() && !alname_val.isEmpty() && !alemail_val.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(alemail_val).matches() && !alphone_val.isEmpty()){
                    Intent i = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity2.this,"successfully registered",Toast.LENGTH_LONG).show();
                }



            }
        });
    }
}