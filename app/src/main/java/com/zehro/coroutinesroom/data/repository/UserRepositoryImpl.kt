package com.zehro.coroutinesroom.data.repository

import com.zehro.coroutinesroom.data.data_source.UserDao
import com.zehro.coroutinesroom.domain.model.User
import com.zehro.coroutinesroom.domain.repository.UserRepository

class UserRepositoryImpl (
    private val dao: UserDao
): UserRepository {

    override fun insert(user: User): Long {
        return dao.insert(user)
    }

    override fun getUser(username: String): User {
        return dao.getUser(username)
    }

    override fun deleteUser(id: Long) {
        dao.deleteUser(id)
    }

}