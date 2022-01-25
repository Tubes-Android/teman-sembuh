package com.example.temansembuh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.temansembuh.model.data.HospitalModel
import com.example.temansembuh.screens.HospitaCard
import com.example.temansembuh.screens.HospitalList
import com.example.temansembuh.ui.theme.TemanSembuhTheme
import com.example.temansembuh.ui.theme.primaryColor
import com.example.temansembuh.ui.theme.textColor
import com.example.temansembuh.viewModel.HospitalViewModel
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TemanSembuhTheme {
                MainScreen()
            }
        }
    }
}
