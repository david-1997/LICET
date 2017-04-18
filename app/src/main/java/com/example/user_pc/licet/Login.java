package com.example.user_pc.licet;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    DatabaseHelper myDb;
  //  Button submit;
    Button btnAddData;
    Button btnviewAll;
    static String regno;
    static String dob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myDb = new DatabaseHelper(this);
        regno = ((EditText)findViewById(R.id.eregno)).getText().toString();
        dob = ((EditText)findViewById(R.id.edob)).getText().toString();
        btnAddData = (Button)findViewById(R.id.submit);
        btnviewAll = (Button)findViewById(R.id.viewbt);
       // submit = (Button)findViewById(R.id.submit);
        //AddData();
        viewAll();
    }

    /*public  void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(regno.getText().toString(),dob.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Login.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Login.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }*/

    public void viewAll() {
        btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();
                        if(res.getCount() == 0) {
                            // show message
                            showMessage("Error","Nothing found");
                            return;
                        }
                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("NAME :"+ res.getString(0)+"\n");
                            buffer.append("REG NO :"+ res.getString(1)+"\n");
                            buffer.append("DATE OF BIRTH :"+ res.getString(2)+"\n");
                            buffer.append("DEPARTMENT :"+ res.getString(3)+"\n\n");
                        }
                        // Show all data
                        showMessage("Student Details",buffer.toString());
                    }
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}

