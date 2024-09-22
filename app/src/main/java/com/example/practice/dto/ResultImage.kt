package com.example.practice.dto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity("resultImage")
class saveResultImage(
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) var id: UUID,
    @ColumnInfo(name = "deviceId") var deviceId: String,
    @ColumnInfo(name = "bodyImage") var bodyImage: ByteArray,
    @ColumnInfo(name = "clothImage") var clothImage: ByteArray,
    @ColumnInfo(name = "resultImage") var resultImage: ByteArray,
    @ColumnInfo(name = "productName") var productName: String,
    @ColumnInfo(name = "productUrl") var productUrl: String
)