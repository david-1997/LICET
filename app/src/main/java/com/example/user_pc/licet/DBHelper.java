package com.example.user_pc.licet;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
public class DBHelper extends SQLiteOpenHelper {
    int i;
    public static final String DATABASE_NAME = "licet.db";
    public DBHelper(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL("create table student "+"(name text,regno integer primary key,dob text, dept text)");
        db.execSQL("insert into student values('David',311114205017,'25/0/1997','IT')");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS student");
        onCreate(db);
    }
    public Cursor getData(String regno,String dob) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from student where regno="+regno+" and dob="+dob+"", null );
        return res;
    }
    // TEST
    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db,"DisplayStudent");
        return numRows;
    }
}
