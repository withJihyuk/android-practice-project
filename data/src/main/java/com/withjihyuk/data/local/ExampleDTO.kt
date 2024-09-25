package com.withjihyuk.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity("resultImage")
data class ExampleDTO(
    @PrimaryKey(autoGenerate = true)
    val id: UUID,
    val deviceId: String,
    val bodyImageId: UUID,
    val clothImageId: UUID,
    val resultImageId: UUID,
    val productName: String,
    val productUrl: String
)