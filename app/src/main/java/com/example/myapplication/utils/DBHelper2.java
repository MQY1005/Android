package com.example.myapplication.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;


public class DBHelper2 extends SQLiteOpenHelper {
    public static final String DB_NAME = "course.db";
    public static final int DB_VERSION = 2;
    public static final String TBL_NAME_RECORD = "tb_record";
    public static final String TBL_RECORD = "create table if not exists " +
            TBL_NAME_RECORD +
            "( id integer primary key autoincrement, " +
            "user_name varchar, " +
            "title varchar )";
    private static DBHelper2 helper;

    public DBHelper2(@Nullable Context context) {
        super(context, DB_NAME, null,DB_VERSION);
    }
    public static DBHelper2 getInstance(Context context){
        if (helper == null){
            helper = new DBHelper2(context);
        }
        return helper;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TBL_RECORD);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists " + TBL_NAME_RECORD);
        onCreate(sqLiteDatabase);
    }
}