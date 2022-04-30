package com.facebooklogin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class second_activity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_second);
        EditText name = findViewById(R.id.name1);
        EditText email = findViewById(R.id.email1);
        EditText phone = findViewById(R.id.phone1);
        Button submit = findViewById(R.id.submit);
        TextInputLayout name_l = findViewById(R.id.name);
        TextInputLayout email_l = findViewById(R.id.email);
        TextInputLayout phone_l = findViewById(R.id.phone);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name_val = name.getText().toString().trim();
                String email_val = email.getText().toString().trim();
                String phone_val = phone.getText().toString().trim();


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
                if (!name_val.isEmpty() && !email_val.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email_val).matches() && !phone_val.isEmpty()){
                    Intent i = new Intent(second_activity.this, MainActivity.class);
                    startActivity(i);
                    Toast.makeText(second_activity.this,"successfully registered",Toast.LENGTH_LONG).show();
                    finish();


                }



            }
        });
    }
}