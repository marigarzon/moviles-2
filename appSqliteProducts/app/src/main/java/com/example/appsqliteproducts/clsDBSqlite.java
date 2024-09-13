package com.example.appsqliteproducts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class clsDBSqlite extends SQLiteOpenHelper {
    // Definir la (s) variable (s) para la creación de las tablas
    String tblProduct = "Create Table product(reference text, description text, price integer, reftype integer)";
    String tblUser = "create table user(user text, fullname text, password text)";
    public clsDBSqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Crear las tablas
        db.execSQL(tblProduct);
        db.execSQL(tblUser);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("Drop table product");
        db.execSQL(tblProduct);
        db.execSQL("drop table user");
        db.execSQL(tblUser);
    }
}
