package com.example.temansembuh.model.service

import androidx.room.Dao
import androidx.room.Query
import com.example.temansembuh.model.data.UserModel
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDatabaseDAO {
    @Query("SELECT * from user")
    fun getAlldata(): Flow<List<UserModel>>
}