package com.example.admin.myapplication.model

import java.sql.Date

data class Coupons(
        private val id: Int,
        private val value: Double,
        private val status: Int,
        private val created_at: Date? = null,
        private val updated_at: Date? = null
)
