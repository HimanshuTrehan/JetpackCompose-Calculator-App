package com.himanshu.calculator.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.himanshu.calculator.CalculatorActions
import com.himanshu.calculator.CalculatorOperations
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
            is CalculatorActions.Operations -> addSymbol(calculatorActions.operations)
            is CalculatorActions.Calculate -> calculateResult()
        }
    }

    private fun addSymbol(operations: CalculatorOperations) {
        if (state.number1.isNotBlank())
        {
            state = state.copy(operation = operations)
        }
    }


    private fun calculateResult() {
        TODO("Not yet implemented")
    }

    private fun removeLast() {
        when {
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )
            state.operation != null -> state = state.copy(
                operation = null
            )
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }

    private fun removeAll() {
        state = CalculatorState()
    }

    private fun addDecimal() {
        if (state.number2.isNotBlank() && !state.number2.contains("."))
        {
           state =  state.copy(number2 = state.number2+".")
            return
        }

        if (state.number1.isNotBlank() && !state.number1.contains(".") && state.operation == null )
        {
            state =  state.copy(number1 = state.number1+".")
            return
        }
    }

    private fun enterNumber(number: Int) {
        if (state.operation == null) {
              state =  state.copy(number1 = state.number1 + number.toString())
                return
        }

        state = state.copy(number2 = state.number2+number)

    }

}