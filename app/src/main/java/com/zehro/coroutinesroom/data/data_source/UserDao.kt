package com.zehro.coroutinesroom.data.data_source

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zehro.coroutinesroom.domain.model.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE) // If already have user, then replace it
    fun insert(user: User): Long // return is the ID of the entry

    @Query("SELECT * FROM user WHERE username = :username")
    fun getUser(username: String): User

    @Query("DELETE FROM user WHERE id = :id")
    fun deleteUser(id: Long)
}