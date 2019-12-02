package com.example.admin.myapplication.model

import java.sql.Date

data class OrderDetails(
        private val id: Int,
        private val quantity: Int,
        private val order_id: Int,
        private val lego_id: Int,
        private val created_at: Date? = null,
        private val updated_at: Date? = null,
        private val prices: Double
)
