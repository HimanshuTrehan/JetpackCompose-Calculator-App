package com.himanshu.calculator

sealed class CalculatorOperations(val symbol:String)
{
    object Add:CalculatorOperations("+")
    object Sub:CalculatorOperations("-")
    object Multiply:CalculatorOperations("x")
    object Division:CalculatorOperations("/")
}
