package com.zehro.coroutinesroom.domain.repository

import com.zehro.coroutinesroom.domain.model.User

interface UserRepository {

    fun insert(user: User): Long
    fun getUser(username: String): User
    fun deleteUser(id: Long)
}