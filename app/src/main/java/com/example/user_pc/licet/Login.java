package com.example.user_pc.licet;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity{
    EditText regno;
    EditText dob;
    Button submit;
    static String sregno;
    static String sdob;
    Intent i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        submit=(Button)findViewById(R.id.submit);
        regno=(EditText)findViewById(R.id.eregno);
        dob=(EditText)findViewById(R.id.edob);
        sregno=regno.getText().toString();
        sdob=dob.getText().toString();
        submit=(Button)findViewById(R.id.submit);
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
