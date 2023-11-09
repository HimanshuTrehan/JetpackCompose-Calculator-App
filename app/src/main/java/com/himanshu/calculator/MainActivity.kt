package com.himanshu.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.himanshu.calculator.components.CalculatorButton
import com.himanshu.calculator.ui.theme.CalculatorTheme
import com.himanshu.calculator.ui.theme.orange

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                var equationText by remember {
                    mutableStateOf("")
                }
                Column(modifier =
                Modifier
                    .background(color = Color.Black)
                    .fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.End

                ) {
                    Spacer(modifier = Modifier.height(height = 100.dp))
                    Text(text = equationText, color = Color.White, fontSize = 36.sp)
                    Row(modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        CalculatorButton(symbol = "AC",
                            modifier =
                            Modifier.weight(2f),
                            onClick = {
                                equationText = ""
                            }
                        )
                        CalculatorButton(symbol = "Del",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                equationText = ""
                            })
                        CalculatorButton(symbol = "%",
                            modifier = Modifier.weight(1f).background(orange),
                            onClick = {
                                equationText += "%"
                            })

                    }
                    Row(modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        CalculatorButton(symbol = "7",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                equationText += "7"
                            })
                        CalculatorButton(symbol = "8",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                equationText += "8"
                            })
                        CalculatorButton(symbol = "9",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                equationText += "9"
                            })
                        CalculatorButton(symbol = "X",
                            modifier = Modifier.weight(1f).background(orange),
                            onClick = {
                                equationText += "X"
                            })

                    }
                    Row(modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        CalculatorButton(symbol = "4",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                equationText += "4"
                            })
                        CalculatorButton(symbol = "5",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                equationText += "5"
                            })
                        CalculatorButton(symbol = "6",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                equationText += "6"
                            })
                        CalculatorButton(symbol = "-",
                            modifier = Modifier.weight(1f).background(orange),
                            onClick = {
                                equationText += "-"
                            })

                    }
                    Row(modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        CalculatorButton(symbol = "1",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                equationText += "1"
                            })
                        CalculatorButton(symbol = "2",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                equationText += "2"
                            })
                        CalculatorButton(symbol = "3",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                equationText += "3"
                            })
                        CalculatorButton(symbol = "+",
                            modifier = Modifier.weight(1f).background(orange),
                            onClick = {
                                equationText += "+"
                            })

                    }
                    Row(modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        CalculatorButton(symbol = "0",
                            modifier =
                            Modifier.weight(2f),
                            onClick = {
                                equationText += "0"
                            })
                        CalculatorButton(symbol = ".",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                equationText += "."
                            })
                        CalculatorButton(symbol = "=",
                            modifier = Modifier.weight(1f).background(orange),
                            onClick = {
                            })

                    }
                }


            }
        }
    }

}

