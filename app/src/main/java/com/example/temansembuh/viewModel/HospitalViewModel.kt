package com.example.temansembuh.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.temansembuh.model.data.HospitalModel
import com.example.temansembuh.model.service.HospitalAPIService
import kotlinx.coroutines.launch

class HospitalViewModel : ViewModel() {
    var hospitalListResponse: List<HospitalModel> by mutableStateOf(listOf())
    var errorMessage: String by mutableStateOf("")

    init {
        viewModelScope.launch {
            val apiService = HospitalAPIService.getInstance()
            try {
                val hospitalList = apiService.getHospital()
                hospitalListResponse = hospitalList
            } catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }

}