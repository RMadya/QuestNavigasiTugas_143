package com.example.navigasi2p6.view


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TampilData(
    onHomeClick: () -> Unit,
    onFormClick: () -> Unit
) {
    val dataPeserta = listOf(
        "Nama Lengkap" to "Jihadut tolibin",
        "Jenis Kelamin" to "Laki-Laki",
        "Status Perkawinan" to "Lajang",
        "Alamat" to "Lombok"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFCE93D8), // ungu muda
                        Color.White
                    )
                )
            )
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Judul
        Text(
            text = "List Daftar Peserta",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
                .background(Color(0xFFBA68C8), RoundedCornerShape(12.dp))
                .padding(vertical = 12.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Daftar Data Peserta
        dataPeserta.forEach { (label, value) ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(16.dp))
                    .padding(vertical = 10.dp, horizontal = 16.dp)
                    .padding(bottom = 8.dp)
                    .then(Modifier.padding(vertical = 5.dp))
            ) {
                Text(
                    text = label.uppercase(),
                    fontSize = 14.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = value,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,
                    color = Color(0xFF4A148C)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Tombol Beranda

