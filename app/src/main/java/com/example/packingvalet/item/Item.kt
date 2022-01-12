package com.example.packingvalet.item

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(
    @PrimaryKey val id: Int,
    @NonNull val name: String,
    @ColumnInfo(name = "is_serial", defaultValue = "false") val isSerial: Boolean,
    @ColumnInfo(name = "category_id") val categoryId: Int?
)