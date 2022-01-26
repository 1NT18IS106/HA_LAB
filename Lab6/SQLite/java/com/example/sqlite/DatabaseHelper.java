package com.example.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int version = 1;

    SQLiteDatabase db;
    public static String dbName = "Company.db";
    public static final String TABLE_NAME = "Empdata";
    public static final String COL1 = "id";
    public static final String COL2 = "name";
    public static final String COL3 = "designation";
    public static final String COL4 = "salary";
    public static final String COL5 = "phoneno";
    public static final String COL6 = "mailid";
    private static final String CREATE_TABLE = "create table if not exists " + TABLE_NAME + "(" + COL1 + " INTEGER PRIMARY KEY AUTOINCREMENT," + COL2 + " TEXT NOT NULL," + COL3 + " TEXT, " + COL4 + " INTEGER," + COL5 + " TEXT ," + COL6 + " VARCHAR(50));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    private Context context;

    public DatabaseHelper(Context context) {
        super(context, dbName, null, version);
        context = this.context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE);
        } catch (Exception e) {
            Toast.makeText(context.getApplicationContext(), "Can't create table", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }


    public boolean InsertEmployee(Employee objEmp) {
            db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put(COL2, objEmp.getEmpName());
            cv.put(COL3, objEmp.getEmpDesig());
            cv.put(COL4, objEmp.getEmpSalary());
            cv.put(COL5, objEmp.getEmpPhone());
            cv.put(COL6, objEmp.getEmpMail());
            long result = db.insert(TABLE_NAME, null, cv);
            if (result == -1)
                return false;
            else
                return true;

        }
    }
