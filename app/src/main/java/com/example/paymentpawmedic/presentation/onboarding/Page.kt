package com.example.paymentpawmedic.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.paymentpawmedic.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Dokter Ahli dan Berpengalaman",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        image= R.drawable.assetdb
    ),
    Page(
        title = "Sayangi Hewan Peliharaan Anda",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        image= R.drawable.assetpb
    )
)