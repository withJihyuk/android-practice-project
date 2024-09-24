package com.example.practice.dto

import androidx.compose.runtime.Immutable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Immutable
@Entity("resultImage")
data class ResultImage(
    @PrimaryKey(autoGenerate = true)
    var id: UUID,
    var deviceId: String,
    var bodyImageId: UUID,
    var clothImageId: UUID,
    var resultImageId: UUID,
    var productName: String,
    var productUrl: String
)