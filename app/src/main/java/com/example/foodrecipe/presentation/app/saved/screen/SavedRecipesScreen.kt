package com.example.foodrecipe.presentation.app.saved.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodrecipe.presentation.componants.GeneralTopBar
import com.example.foodrecipe.presentation.componants.cards.SavedRecipeCard
import com.example.foodrecipe.ui.theme.Transparent

@Preview
@Composable
fun SavedRecipesScreen() {
    Scaffold(
        containerColor = Transparent,
        topBar = {
            GeneralTopBar(
                title = "Saved recipes",
                isNavigationIcon = false,
                isShareIcon = false,
                isLogoutIcon = false,
                onCLickCallBack = {}
            )
        }
    ) { innerPadding ->
        ScreenContent(innerPadding)
    }
}

@Composable
private fun ScreenContent(innerPadding: PaddingValues) {
    Column(modifier = Modifier.padding(innerPadding)) {
        LazyColumn(contentPadding = PaddingValues(16.dp)) {
            items(10) {
                SavedRecipeCard()
                Spacer(Modifier.height(16.dp))
            }
        }
    }
}