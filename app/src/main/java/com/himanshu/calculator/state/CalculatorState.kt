package com.himanshu.calculator.state

import com.himanshu.calculator.CalculatorOperations

data class CalculatorState
    (
    val number1:String="",
    val number2:String="",
    val operation : CalculatorOperations? = null
    )
