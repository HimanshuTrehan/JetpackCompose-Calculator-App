package com.himanshu.calculator.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.himanshu.calculator.ui.theme.orange

@Composable
fun CalculatorButton(symbol:String,modifier: Modifier = Modifier,onClick:()->Unit)
{
    Box(

        modifier = Modifier
            .clickable { onClick() }
            .clip(CircleShape)
            .background(Color.Gray)
            .then(modifier),
        contentAlignment = Alignment.Center
        )  {
        Text(text = symbol,
            fontSize = 36.sp,
            color = Color.White,
            modifier = Modifier.padding(20.dp)
        )
    }
}