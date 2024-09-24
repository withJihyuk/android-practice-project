package com.withjihyuk.data.remote.dto.request

data class ConvertImageRequest(
    val modelImage: ByteArray,
    val clothImage: ByteArray,
)