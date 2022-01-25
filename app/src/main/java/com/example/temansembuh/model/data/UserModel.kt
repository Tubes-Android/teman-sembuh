package com.example.temansembuh.model.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserModel(
    @PrimaryKey(autoGenerate = true)
    var itemId: Int,

    val name: String,

    val email: String,

    val phones: String,

    val address: String
)
