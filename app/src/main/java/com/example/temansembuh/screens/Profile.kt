package com.example.temansembuh.screens

import androidx.compose.foundation.background
import androidx.activity.viewModels
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
    ) {
        if (result.isNotEmpty()) {
            for (user in result) {
                Text(
                    text = "Nama: ${user.name}",
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Email: ${user.email}",
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Phones: ${user.phones}",
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Address: ${user.address}",
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Bold
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
@Preview
fun ProfileScreenPreview() {
    TemanSembuhTheme {
        ProfileScreen()
    }
}