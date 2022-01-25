package com.example.temansembuh.viewModel

import androidx.lifecycle.ViewModel
import com.example.temansembuh.model.service.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    userRepository: UserRepository
) : ViewModel() {
    val getAllData = userRepository.getAllData
}