package com.alexander.mintedreader.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun ReaderSplashScreen(navController: NavController) {
    Surface(
        modifier = Modifier
            .padding(15.dp)
            .size(300.dp),
        shape = CircleShape,
        color = Color.Red.copy(alpha = 0.6f),
        border = BorderStroke(width = 2.dp, color = Color.Red)
    ) {
        Column(
            modifier = Modifier.padding(1.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = "Minted",
                style = TextStyle(
                    fontSize = 45.sp,
                    color = Color.White
                ),
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "\"Read. Change, Yourself\"",
                style = TextStyle(
                    fontSize = 19.sp,
                    color = Color.Yellow.copy(0.7f)
                )
            )
        }
    }
}