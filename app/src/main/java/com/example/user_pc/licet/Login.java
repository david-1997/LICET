package com.example.user_pc.licet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity{
    EditText regno;
    EditText dob;
    Button submit;
    Intent i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        regno=(EditText)findViewById(R.id.regno);
        dob=(EditText)findViewById(R.id.dob);
        String sregno=regno.getText().toString();
        String sdob=dob.getText().toString();
        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                i1=new Intent(Login.this,DisplayStudent.class);
                startActivity(i1);
            }
        });
    }
}
