package com.example.temansembuh.model.service

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.temansembuh.model.data.UserModel

@Database(entities = [UserModel::class], version = 1, exportSchema = true)
abstract class UserDatabase: RoomDatabase() {
    abstract fun userDao(): UserDatabaseDAO
}