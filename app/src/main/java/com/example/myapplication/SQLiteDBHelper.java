package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// SQLite DB for storing user data on calls etc, can be extended in the future
public class SQLiteDBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "contacts_database";
    public static final String CONTACT_TABLE_NAME = "contact";
    public static final String CONTACT_COLUMN_ID = "_id";
    public static final String CONTACT_COLUMN_NAME = "name";
    public static final String CONTACT_COLUMN_OUT = "outgoing_fail";
    public static final String CONTACT_COLUMN_IN = "outgoing_success";

    public SQLiteDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + CONTACT_TABLE_NAME + " (" +
                CONTACT_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CONTACT_COLUMN_NAME + " TEXT, " +
                CONTACT_COLUMN_OUT + " INT, " +
                CONTACT_COLUMN_IN + " INT" + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + CONTACT_TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}