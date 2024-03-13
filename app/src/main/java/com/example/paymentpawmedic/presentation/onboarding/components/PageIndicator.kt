package com.example.paymentpawmedic.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import com.example.paymentpawmedic.presentation.onboarding.Page
import com.example.paymentpawmedic.ui.theme.PurpleGrey80
import com.example.paymentpawmedic.presentation.Dimens.indicatorSize
import com.example.paymentpawmedic.ui.theme.Pink40

@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    selectedPage: Int,
    selectedColor: Color = MaterialTheme.colorScheme.primary,
    unselectedColor: Color = Gray

) {
    Row(modifier = modifier, horizontalArrangement = Arrangement.SpaceBetween) {
        repeat(pageSize){
            page-> Box(modifier=Modifier.size(indicatorSize).clip(CircleShape)
            .background(color= if(page == selectedPage) selectedColor else unselectedColor))
        }
    }
}