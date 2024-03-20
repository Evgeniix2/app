package com.example.myapplication.data

import androidx.room.ColumnInfo
import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    val title: String,
    val description: String?,
    val isDone: Boolean,
    val dataCreation: Long,
    @PrimaryKey val id: Int? = null
)






