package com.example.temansembuh.screens

import androidx.compose.foundation.background
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.temansembuh.ui.theme.TemanSembuhTheme
import com.example.temansembuh.viewModel.UserViewModel

@Composable
fun ProfileScreen() {
    val userViewModel: UserViewModel by viewModel()
    val result by userViewModel.getAllData.collectAsState(initial = emptyList())
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center
    ) {
        if (result.isNotEmpty()) {
            for (user in result) {
//                profileList(
//                    name = user.name,
//                    email = user.email,
//                    phones = user.phones,
//                    address = user.address
//                )
                profileList(
                    name = "Widadi",
                    email = "Widadi@gmail.com",
                    phones = "081234542164",
                    address = "Jl. Bugbugfixes-final-edition"
                )
            }
        } else {
            Text(
                text = "Empty database",
                style = MaterialTheme.typography.body1,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun profileList(
    name: String,
    email: String,
    phones: String,
    address: String,
) {
    Column {
        Text(
            text = "Nama: ${name}",
            style = MaterialTheme.typography.body1,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Email: ${email}",
            style = MaterialTheme.typography.body1,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Phones: ${phones}",
            style = MaterialTheme.typography.body1,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Address: ${address}",
            style = MaterialTheme.typography.body1,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
@Preview
fun ProfileScreenPreview() {
    TemanSembuhTheme {
        profileList(
            name = "Widadi",
            email = "Widadi@gmail.com",
            phones = "081234542164",
            address = "Jl. Bugbugfixes-final-edition"
        )
    }
}