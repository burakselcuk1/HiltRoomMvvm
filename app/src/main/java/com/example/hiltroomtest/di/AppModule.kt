package com.example.hiltroomtest.di

import android.content.Context
import androidx.room.Room
import com.example.hiltroomtest.db.toDoDatabase
import com.example.hiltroomtest.model.toDo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideToDoDataBase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context, toDoDatabase::class.java,
        "todo"
    ).build()

    @Singleton
    @Provides
    fun provideToDoDao(
        db: toDoDatabase
    ) = db.toDoDao()

}