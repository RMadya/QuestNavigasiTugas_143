package com.example.navigasi2p6.view


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay


@Composable
fun FormDataDiriStyled(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit
) {
    // states
    var namaInput by remember { mutableStateOf("") }
    var alamatInput by remember { mutableStateOf("") }
    var genderInput by remember { mutableStateOf("") }
    var statusInput by remember { mutableStateOf("") }

    var submittedNama by remember { mutableStateOf("") }
    var submittedGender by remember { mutableStateOf("") }
    var submittedStatus by remember { mutableStateOf("") }
    var submittedAlamat by remember { mutableStateOf("") }

    var isSubmitted by remember { mutableStateOf(false) }

    val genders = listOf("Laki-laki", "Perempuan")
    val statuses = listOf("Janda", "Lajang", "Duda")

    // visuals
    val headerGradient = Brush.verticalGradient(colors = listOf(Color(0xFFCE93D8), Color(0xFFE1BEE7)))
    val primaryPurple = Color(0xFF8E24AA)
    val labelColorOnWhite = Color(0xFF555555)
    val cardResultBg = Color(0xFF222222)
    val cardResultText = Color.White

    val scrollState = rememberScrollState()


