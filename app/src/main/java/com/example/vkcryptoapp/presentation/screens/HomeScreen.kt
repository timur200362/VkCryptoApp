package com.example.vkcryptoapp.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.vkcryptoapp.presentation.mvvm.HomeViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = koinViewModel()
) {

    var selectedCurrency by remember { mutableStateOf("") }
    var result = homeViewModel.resultConversion.collectAsStateWithLifecycle()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        DropdownMenu(
            expanded = true,
            onDismissRequest = {}
        ) {
            DropdownMenuItem(onClick = { selectedCurrency = "USD" }, text = {Text("USD")} )

            DropdownMenuItem(onClick = { selectedCurrency = "EUR" }, text = {Text("EUR")} )
            DropdownMenuItem(onClick = { selectedCurrency = "BTC" }, text = {Text("BTC")} )
        }

        Button(onClick = {homeViewModel.conversion(selectedCurrency) }) {
            Text("Convert")
        }
        Text(result.toString())
    }
}