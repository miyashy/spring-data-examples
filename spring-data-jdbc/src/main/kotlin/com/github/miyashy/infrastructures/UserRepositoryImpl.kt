package com.github.miyashy.infrastructures

import com.github.miyashy.domains.User
import com.github.miyashy.domains.values.UserId
import org.springframework.data.repository.PagingAndSortingRepository

interface UserRepositoryImpl : PagingAndSortingRepository<User, UserId>