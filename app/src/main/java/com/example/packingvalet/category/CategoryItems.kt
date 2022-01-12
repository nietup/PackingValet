package com.example.packingvalet.category

import androidx.room.Embedded
import androidx.room.Relation
import com.example.packingvalet.item.Item

data class CategoryItems(
    @Embedded val category: Category,
    @Relation(
        parentColumn = "id",
        entityColumn = "categoryId"
    )
    val items: List<Item>
)
