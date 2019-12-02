package com.example.admin.myapplication.model

import java.sql.Date

data class Comments(
        private val id: String,
        private val content: String,
        private val parent_id: Int ?= null,
        private val user_id: Int,
        private val lego_id: Int,
        private val created_at: Date ?= null,
        private val updated_at: Date ?= null
)
