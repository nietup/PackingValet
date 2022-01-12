package com.example.packingvalet.trip

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Trip(
    @PrimaryKey val id: Int,
    @NonNull val name: String,
    val nights: Int?
)