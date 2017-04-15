package com.example.user_pc.licet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Intent i1;
    Intent i2;
    Intent i3;
    Intent i4;
    Intent i5;
    Intent i6;
    Intent i7;
    Intent i8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button events = (Button) findViewById(R.id.events);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1=new Intent(MainActivity.this,MainActivity1.class);
                startActivity(i1);
            }
        });
        Button news = (Button) findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i2);
            }
        });

        Button photos = (Button) findViewById(R.id.photos);
        photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i3=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(i3);
            }
        });
        Button dept = (Button) findViewById(R.id.depts);
        dept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i4=new Intent(MainActivity.this,MainActivity5.class);
                startActivity(i4);
            }
    });

        Button contact = (Button) findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i5=new Intent(MainActivity.this,MainActivity8.class);
                startActivity(i5);
            }
        });
        Button about = (Button) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i6=new Intent(MainActivity.this,MainActivity7.class);
                startActivity(i6);
            }
        });
        Button adm = (Button) findViewById(R.id.admission);
        adm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i7=new Intent(MainActivity.this,MainActivity6.class);
                startActivity(i7);
            }
        });
        final ImageButton login=(ImageButton)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View view) {
                    i8=new Intent(MainActivity.this,Login.class);
                    startActivity(i8);
            }
        });
        Button location = (Button) findViewById(R.id.location);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.co.in/maps/dir/''/licet/@13.0592881,80.1636181,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3a5266606a8d51eb:0xcfedaad4ca5bd750!2m2!1d80.2336586!2d13.0592975");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
    }
}
