package com.example.packingvalet.category

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Category(
    @PrimaryKey val id: Int,
    @NonNull @ColumnInfo(name = "name") val name: String
)