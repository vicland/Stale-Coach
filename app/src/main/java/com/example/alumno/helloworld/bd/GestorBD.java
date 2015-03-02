package com.example.alumno.helloworld.bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.alumno.helloworld.Modelo.Deporte;

import java.util.ArrayList;
import java.util.List;

public class GestorBD extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "staleCoach";

    public GestorBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String crearTablaDeporte="create table deporte (" +
                "id_deporte INTEGER PRIMARY KEY," +
                "deporte varchar (255)," +
                "fondo varchar (255)," +
                "campo varchar(255))";
        db.execSQL(crearTablaDeporte);

        String crearTablaentrenamineto="create table entrenamineto (" +
                "id_entre INTEGER PRIMARY KEY," +
                "nombre varchar (255)," +
                "id_deporte integer references deporte(id_deporte)," +
                "imagen_miniatura varchar (255)," +
                "descripcion varchar (255)," +
                "categoria integer references categoria_entrenamiento(id_cat_entre))";
        db.execSQL(crearTablaentrenamineto);

        String objeto_entrenamiento="create table objeto_entrenamiento(" +
                "id_obj INTEGER PRIMARY KEY," +
                "nombre varchar (255)," +
                "descripcion varchar (255)," +
                "imagen varchar (255))";
        db.execSQL(objeto_entrenamiento);

        String coordenadas_entrenamiento="create table coordenadas_entrenamiento (" +
                "id_obj INTEGER references objeto_entrenamiento(id_obj)," +
                "id_entr INTEGER references entrenamineto(id_entre)," +
                "coordx REAL," +
                "coordy REAL," +
                "PRIMARY KEY (id_obj, id_entr))";
        db.execSQL(coordenadas_entrenamiento);

        String categoria_entrenamiento="create table categoria_entrenamiento(" +
                "id_cat INTEGER PRIMARY KEY," +
                "nombre varchar (255)," +
                "descripcion varchar (255))";
        db.execSQL(categoria_entrenamiento);

        String alineacion="create table alineacion(" +
                "id_alin INTEGER PRIMARY KEY," +
                "nombre varchar (255)," +
                "id_deporte integer references deporte(id_deporte)," +
                "imagen_miniatura varchar (255)," +
                "descripcion varchar (255))";
        db.execSQL(alineacion);

        String coordenadas_alineacion="create table coordenadas_alineacion(" +
                "id_obj INTEGER references objeto_entrenamiento(id_obj)," +
                "id_alin INTEGER references alineacion(id_alin)," +
                "coordx REAL," +
                "coordy REAL," +
                "PRIMARY KEY (id_obj, id_alin))";
        db.execSQL(coordenadas_alineacion);

    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        //db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

        // Create tables again
        onCreate(db);
    }
    public void crearDeporte(Deporte d){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("id_deporte", d.getId_deporte());
        values.put("deporte", d.getNombre());
        values.put("fondo", d.getFondo());
        values.put("campo", d.getCampo());
        db.insert("deporte", null, values);
        db.close(); // Closing database connection
    }
    public List<Deporte> obtenerDeportes(){
        List<Deporte> contactList = new ArrayList<Deporte>();
        // Select All Query
        String selectQuery = "SELECT  * FROM deporte";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                contactList.add(new Deporte(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3)));
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return contactList;
    }
    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */
/*
    // Adding new contact
    public void addContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contact.getName()); // Contact Name
        values.put(KEY_PH_NO, contact.getPhoneNumber()); // Contact Phone

        // Inserting Row
        db.insert(TABLE_CONTACTS, null, values);
        db.close(); // Closing database connection
    }

    // Getting single contact
    public Contact getContact(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_CONTACTS, new String[] { KEY_ID,
                        KEY_NAME, KEY_PH_NO }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Contact contact = new Contact(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));
        // return contact
        return contact;
    }

    // Getting All Contacts
    public List<Contact> getAllContacts() {
        List<Contact> contactList = new ArrayList<Contact>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_CONTACTS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Contact contact = new Contact();
                contact.setID(Integer.parseInt(cursor.getString(0)));
                contact.setName(cursor.getString(1));
                contact.setPhoneNumber(cursor.getString(2));
                // Adding contact to list
                contactList.add(contact);
            } while (cursor.moveToNext());
        }

        // return contact list
        return contactList;
    }

    // Updating single contact
    public int updateContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contact.getName());
        values.put(KEY_PH_NO, contact.getPhoneNumber());

        // updating row
        return db.update(TABLE_CONTACTS, values, KEY_ID + " = ?",
                new String[] { String.valueOf(contact.getID()) });
    }

    // Deleting single contact
    public void deleteContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CONTACTS, KEY_ID + " = ?",
                new String[] { String.valueOf(contact.getID()) });
        db.close();
    }


    // Getting contacts Count
    public int getContactsCount() {
        String countQuery = "SELECT  * FROM " + TABLE_CONTACTS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
*/
}