package com.example.packingvalet.config

import android.app.Application

class PackingValetApplication: Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}