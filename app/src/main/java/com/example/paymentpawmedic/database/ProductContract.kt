package com.example.paymentpawmedic.database

import android.provider.BaseColumns

object ProductContract {
    // Skema tabel produk
    object ProductEntry : BaseColumns {
        const val TABLE_NAME = "products"
        const val COLUMN_NAME_ID = "id"
        const val COLUMN_NAME_NAME = "name"
        const val COLUMN_NAME_PRICE = "price"
        const val COLUMN_NAME_IMAGE_URL = "image_url"
        const val COLUMN_NAME_DETAIL = "detail"
    }
}