package com.himanshu.calculator.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.himanshu.calculator.CalculatorActions
import com.himanshu.calculator.state.CalculatorState

class CalculatorViewModel:ViewModel() {
    var state by mutableStateOf(CalculatorState())
    private set


    fun onAction(calculatorActions: CalculatorActions)
    {
        when(calculatorActions)
        {
            is CalculatorActions.Number -> enterNumber(calculatorActions.number);
            is CalculatorActions.Decimal -> addDecimal()
            is CalculatorActions.AllClear -> removeAll()
            is CalculatorActions.Clear -> removeLast()
            is CalculatorActions.Operations -> addSymbol(calculatorActions.operations.symbol)
            is CalculatorActions.Calculate -> calculateResult()
        }
    }

    private fun addSymbol(symbol: String) {

    }

    private fun calculateResult() {
        TODO("Not yet implemented")
    }

    private fun removeLast() {
        TODO("Not yet implemented")
    }

    private fun removeAll() {
        TODO("Not yet implemented")
    }

    private fun addDecimal() {
        TODO("Not yet implemented")
    }

    private fun enterNumber(number: Int) {

    }

}