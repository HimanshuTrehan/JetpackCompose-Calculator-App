package com.himanshu.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.himanshu.calculator.components.CalculatorButton

import com.himanshu.calculator.ui.theme.CalculatorTheme
import com.himanshu.calculator.ui.theme.orange
import com.himanshu.calculator.viewmodel.CalculatorViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                val viewModel = viewModels<CalculatorViewModel>()
                val state = viewModel.value.state
                Column(modifier =
                Modifier
                    .background(color = Color.Black)
                    .fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.End

                ) {
                    Spacer(modifier = Modifier.height(height = 100.dp))
                    Text(text = state.number1 + (state.operation?.symbol ?: "") + state.number2, color = Color.White, fontSize = 36.sp)

                    Row(modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        CalculatorButton(symbol = "AC",
                            modifier =
                            Modifier.weight(2f),
                            onClick = {
                                    viewModel.value.onAction(calculatorActions = CalculatorActions.AllClear)
                            }
                        )
                        CalculatorButton(symbol = "Del",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Clear)
                            })
                        CalculatorButton(symbol = "%",
                            modifier = Modifier.weight(1f).background(orange),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Operations(CalculatorOperations.Division))
                            })

                    }
                    Row(modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        CalculatorButton(symbol = "7",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Number(7))
                            })
                        CalculatorButton(symbol = "8",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Number(8))
                            })
                        CalculatorButton(symbol = "9",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Number(9))
                            })
                        CalculatorButton(symbol = "X",
                            modifier = Modifier.weight(1f).background(orange),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Operations(CalculatorOperations.Multiply))
                            })

                    }
                    Row(modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        CalculatorButton(symbol = "4",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Number(4))
                            })
                        CalculatorButton(symbol = "5",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Number(5))
                            })
                        CalculatorButton(symbol = "6",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Number(6))
                            })
                        CalculatorButton(symbol = "-",
                            modifier = Modifier.weight(1f).background(orange),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Operations(CalculatorOperations.Sub))

                            })

                    }
                    Row(modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        CalculatorButton(symbol = "1",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Number(1))
                            })
                        CalculatorButton(symbol = "2",
                            modifier =
                            Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Number(2))
                            })
                        CalculatorButton(symbol = "3",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Number(3))
                            })
                        CalculatorButton(symbol = "+",
                            modifier = Modifier.weight(1f).background(orange),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Operations(CalculatorOperations.Add))

                            })

                    }
                    Row(modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        CalculatorButton(symbol = "0",
                            modifier =
                            Modifier.weight(2f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Number(0))
                            })
                        CalculatorButton(symbol = ".",
                            modifier = Modifier.weight(1f),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Decimal)

                            })
                        CalculatorButton(symbol = "=",
                            modifier = Modifier.weight(1f).background(orange),
                            onClick = {
                                viewModel.value.onAction(calculatorActions = CalculatorActions.Calculate)
                            })

                    }
                }

            }
        }
    }

}

