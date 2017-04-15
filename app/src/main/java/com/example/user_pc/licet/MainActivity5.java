package com.example.user_pc.licet;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class MainActivity5 extends AppCompatActivity {

    Intent i1;
    Intent i2;
    Intent i3;
    Intent i4;
    Intent i5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dept);
        Button it = (Button) findViewById(R.id.it);
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1=new Intent(MainActivity5.this,MainActivity9.class);
                startActivity(i1);
            }
        });
        Button cse = (Button) findViewById(R.id.cse);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2=new Intent(MainActivity5.this,MainActivity13.class);
                startActivity(i2);
            }
        });
        Button ece = (Button) findViewById(R.id.ece);
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i3=new Intent(MainActivity5.this,MainActivity11.class);
                startActivity(i3);
            }
        });
        Button eee = (Button) findViewById(R.id.eee);
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i4=new Intent(MainActivity5.this,MainActivity10.class);
                startActivity(i4);
            }
        });
        Button mech = (Button) findViewById(R.id.mech);
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i5=new Intent(MainActivity5.this,MainActivity12.class);
                startActivity(i5);
            }
        });
    }
}
