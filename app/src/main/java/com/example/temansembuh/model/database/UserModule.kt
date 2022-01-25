package com.example.temansembuh.model.database

import android.content.Context
import androidx.room.Room
import com.example.temansembuh.model.service.UserDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UserModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        UserDatabase::class.java,
        "user"
    )
        .createFromAsset("database/user.db")
        .build()

    @Singleton
    @Provides
    fun provideDao(database: UserDatabase) = database.userDao()
}