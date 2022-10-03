package com.zehro.coroutinesroom.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    val username: String,
    @ColumnInfo(name = "password_hash")
    val passwordHash: Int, // Store a hash of the password
    val info: String,
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0
)
