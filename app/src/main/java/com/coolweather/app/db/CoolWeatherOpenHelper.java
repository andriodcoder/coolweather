package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.hardware.camera2.params.StreamConfigurationMap;

/**
 * Created by WU on 2017/4/8/0008.
 */
 public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    /**
     * Province表建表语句
     */
    public static final String CREATE_PROVICE = "create table Province("
            + "id integer primary key autoincrement,"
            + "provice_name text,"
            + "provice_code text)";
    /**
     * City表建表语句
     */

    public static final String CREATE_CITY = "create table City("
            + "id integer primary key autoincrement,"
            + "city_name text," +
            "city_code text," +
            "provice_id integer)";
    /**
     * County表建表语句
     */

    public static final String CREATE_COUNTY = "create table County(" +
            "id integer primary key autoincrement," +
            "county_name text," +
            "county_code text," +
            "city_id integer)";
    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVICE);//创建Provice表
        db.execSQL(CREATE_CITY);//创建City表
        db.execSQL(CREATE_COUNTY);//创建County表
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion ,int newVersion){

    }
}
