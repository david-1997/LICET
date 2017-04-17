package com.example.user_pc.licet;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.widget.TextView;

public class DisplayStudent extends Activity {
    private DBHelper mydb;
    TextView name;
    TextView regno;
    TextView dob;
    TextView dept;
    String sname;
    String sdept;
    Cursor rs;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        name = (TextView) findViewById(R.id.name);
        regno = (TextView) findViewById(R.id.regno);
        dob = (TextView) findViewById(R.id.dob);
        dept = (TextView) findViewById(R.id.dept);
        db=openOrCreateDatabase("LICET", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(name VARCHAR,rollno VARCHAR,dob VARCHAR,dept VARCHAR);");
        Cursor c=db.rawQuery("SELECT * FROM student where regno='"+Login.sregno+"' and dob='"+Login.sdob+"'", null);
        if(c.moveToFirst())
        {
            name.setText(c.getString(0));
            dept.setText(c.getString(3));
        }
        else
        {
                //activity to show empty list
        }
    }
}