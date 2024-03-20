package com.example.chatfiturrrr.database

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.chatfiturrrr.model.User

class DatabaseHelper (private val context: Context?) : SQLiteOpenHelper(
    context, DATABASE_NAME, null, DATABASE_VERSION
) {
    companion object{
        private const val DATABASE_NAME = "UserDatabase.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_NAME = "dataUser"
        private const val COLUMN_ID = "id"
        private const val COLUMN_USERNAME = "username"
        private const val COLUMN_EMAIL = "email"
        private const val COLUMN_PASSWORD = "password"


    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTableQuery = ("CREATE TABLE $TABLE_NAME (" +
                "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_USERNAME TEXT, " +
                "$COLUMN_EMAIL TEXT, " +
                "$COLUMN_PASSWORD TEXT)")
        db?.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val dropTableQuery = "DROP TABLE IF EXISTS $TABLE_NAME"
        db?.execSQL(dropTableQuery)
        onCreate(db)
    }

    fun insertUser(username: String, email: String, password: String): Long {

        val values = ContentValues().apply {
            put(COLUMN_USERNAME, username)
            put(COLUMN_EMAIL, email)
            put(COLUMN_PASSWORD, password)

        }
        val db = writableDatabase
        return db.insert(TABLE_NAME, null, values)
    }

    fun readUser(username: String, email: String, password: String): Boolean{
        val db = readableDatabase
        val selection = "$COLUMN_USERNAME = ? AND $COLUMN_EMAIL = ? AND $COLUMN_PASSWORD = ?"
        val selectionArgs = arrayOf(username, email, password)
        val cursor = db.query(TABLE_NAME, null, selection, selectionArgs, null, null, null)

        val userExists = cursor.count > 0
        cursor.close()
        return userExists
    }
    @SuppressLint("Range")
    fun getAllUsers(): MutableList<User> {
        val userList = mutableListOf<User>()
        val db = readableDatabase
        val query = "SELECT * FROM $TABLE_NAME"
        val cursor = db.rawQuery(query, null)
        cursor.use {
            while (it.moveToNext()) {
                val id = it.getInt(it.getColumnIndex(COLUMN_ID))
                val username = it.getString(it.getColumnIndex(COLUMN_USERNAME))
                val email = it.getString(it.getColumnIndex(COLUMN_EMAIL))
                val password = it.getString(it.getColumnIndex(COLUMN_PASSWORD))
                val user = User(id, username, email, password)
                userList.add(user)
            }
        }
        return userList
    }
}