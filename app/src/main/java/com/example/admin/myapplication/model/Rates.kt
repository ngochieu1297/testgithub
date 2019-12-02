package com.example.admin.myapplication.model

import java.sql.Date

data class Rates(
        private val id: Int,
        private val star: Int,
        private val user_id: Int,
        private val book_id: Int,
        private val created_at: Date? = null,
        private val updated_at: Date? = null
)
