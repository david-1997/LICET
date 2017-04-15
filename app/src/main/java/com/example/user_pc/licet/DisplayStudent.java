package com.example.user_pc.licet;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayStudent extends Activity {
    private DBHelper mydb;
    TextView name;
    TextView regno;
    TextView dob;
    TextView dept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student);
        name = (TextView) findViewById(R.id.name);
        regno = (TextView) findViewById(R.id.regno);
        dob = (TextView) findViewById(R.id.dob);
        dept = (TextView) findViewById(R.id.dept);
        String sregno=regno.getText().toString();
        String sdob=dob.getText().toString();
        mydb = new DBHelper(this);
        Cursor rs = mydb.getData(sregno,sdob);
        rs.moveToFirst();
        String sname=rs.getString(0);
        String sdept=rs.getString(3);
        name.setText(sname);
        regno.setText(sregno);
        dob.setText(sdob);
        dept.setText(sdept);
    }
}