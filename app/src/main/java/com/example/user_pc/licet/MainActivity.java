package com.example.user_pc.licet;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
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
        ImageButton events = (ImageButton) findViewById(R.id.events);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1=new Intent(MainActivity.this,Events.class);
                startActivity(i1);
            }
        });
        ImageButton news = (ImageButton) findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2=new Intent(MainActivity.this,News.class);
                startActivity(i2);
            }
        });
        ImageButton photos = (ImageButton) findViewById(R.id.photos);
        photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i3=new Intent(MainActivity.this,Photos.class);
                startActivity(i3);
            }
        });
        ImageButton dept = (ImageButton) findViewById(R.id.depts);
        dept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i4=new Intent(MainActivity.this,Departments.class);
                startActivity(i4);
            }
    });

        ImageButton contact = (ImageButton) findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i5=new Intent(MainActivity.this,Contact.class);
                startActivity(i5);
            }
        });
        ImageButton about = (ImageButton) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i6=new Intent(MainActivity.this,About.class);
                startActivity(i6);
            }
        });
        ImageButton admission = (ImageButton) findViewById(R.id.admission);
        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i7=new Intent(MainActivity.this,Admission.class);
                startActivity(i7);
            }
        });
        ImageButton loginbutton=(ImageButton)findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View view) {
                    i8=new Intent(MainActivity.this,Login.class);
                    startActivity(i8);
            }
        });
        ImageButton location = (ImageButton) findViewById(R.id.location);
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
