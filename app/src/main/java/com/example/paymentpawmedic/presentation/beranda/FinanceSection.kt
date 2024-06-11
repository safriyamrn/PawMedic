package com.example.paymentpawmedic.presentation.beranda


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Book
import androidx.compose.material.icons.rounded.MeetingRoom
import androidx.compose.material.icons.rounded.Store
import androidx.compose.material.icons.rounded.VerifiedUser
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paymentpawmedic.presentation.common.Finance
import com.example.paymentpawmedic.ui.theme.LightRed

val financeList = listOf(
    Finance(
        icon = Icons.Rounded.VerifiedUser,
        name = "Janji Temu",
        background = LightRed
    ),

    Finance(
        icon = Icons.Rounded.MeetingRoom,
        name = "Konsultasi",
        background = LightRed
    ),

    Finance(
        icon = Icons.Rounded.Store,
        name = "Toko",
        background = LightRed
    ),

    Finance(
        icon = Icons.Rounded.Book,
        name = "Informasi",
        background = LightRed
    ),
)

@Preview
@Composable
fun FinanceSection() {

    val groupedFinanceList = financeList.chunked(2)

    LazyColumn (modifier = Modifier.fillMaxWidth(), // Membuat LazyColumn memenuhi lebar layar
    horizontalAlignment = Alignment.CenterHorizontally) // Mengatur posisi LazyColumn ke tengah secara horizontal
    {
        groupedFinanceList.forEachIndexed { index, row ->
            item {
                Row (horizontalArrangement = Arrangement.Center)  {
                    // Menampilkan dua FinanceItem dalam satu baris
                    FinanceItem(row[0])
                    Spacer(modifier = Modifier.width(0.dp)) // Spacer antara dua FinanceItem
                    if (row.size > 1) {
                        FinanceItem(row[1])
                    }
                }
                // Spacer vertikal antara setiap baris
                Spacer(modifier = Modifier.height(25.dp))
            }
        }
    }
}

@Composable
fun FinanceItem(finance: Finance) {
    Box(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .size(120.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(MaterialTheme.colorScheme.secondaryContainer)
            .clickable { }
            .padding(13.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(finance.background)
                    .padding(6.dp)
            ) {
                Icon(
                    imageVector = finance.icon,
                    contentDescription = finance.name,
                    tint = Color.White
                )
            }
            Text(
                text = finance.name,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp
            )
        }
    }
}











