package com.example.temansembuh.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.temansembuh.model.data.HospitalModel
import com.example.temansembuh.ui.theme.TemanSembuhTheme
import com.example.temansembuh.viewModel.HospitalViewModel

@Composable
fun HospitalScreen() {
    val scrollState = rememberScrollState()
    val viewModel: HospitalViewModel = viewModel()
    Column(
        modifier = Modifier
            .scrollable(
                state = scrollState,
                orientation = Orientation.Vertical
            )
    ) {

    }
    HospitalList(hospitalList = viewModel.hospitalListResponse)
}
@Composable
fun HospitalList(hospitalList: List<HospitalModel>) {
    var selectedIndex by remember { mutableStateOf(-1) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        itemsIndexed(items = hospitalList) { index, item ->
            HospitaCard(hospital = item, index, selectedIndex) { i ->
                selectedIndex = i
            }
        }
    }
}

@Composable
fun HospitaCard(
    hospital: HospitalModel,
    index: Int,
    selectedIndex: Int,
    onClick: (Int) -> Unit
) {
    val backgroundColor =
        if (index == selectedIndex) MaterialTheme.colors.primary else MaterialTheme.colors.background
    Card(
        modifier = Modifier
            .padding(8.dp, 4.dp)
            .fillMaxWidth()
            .clickable { onClick(index) }
            .height(110.dp), shape = RoundedCornerShape(8.dp), elevation = 4.dp
    ) {
        Surface(color = backgroundColor) {
            Row {
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxHeight()
                ) {
                    Column {
                        Text(
                            text = hospital.name,
                            style = MaterialTheme.typography.h5,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = hospital.phone,
                            style = MaterialTheme.typography.body2,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .background(
                                    Color.LightGray
                                )
                                .padding(4.dp)
                        )
                        Text(
                            text = hospital.address,
                            style = MaterialTheme.typography.subtitle2,
                            fontWeight = FontWeight.Light,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )

                    }
                }
            }

        }
    }

}

@Composable
@Preview
fun HospitalScreenPreview() {
    val viewModel: HospitalViewModel = viewModel()
    TemanSembuhTheme {
        HospitalList(
            hospitalList = viewModel.hospitalListResponse
        )

    }
}