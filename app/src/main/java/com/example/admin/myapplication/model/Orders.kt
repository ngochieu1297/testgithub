package com.example.admin.myapplication.model

import java.sql.Date

data class Orders(
        private val id: Int,
        private val total_price: Double,
        private val discount: Double,
        private val paid: Int,
        private val ship_address: String,
        private val phone: String,
        private val user_id: Int,
        private val coupon_id: Int? = null,
        private val created_at: Date? = null,
        private val updated_at: Date? = null,
        private val name_ship: String
)
