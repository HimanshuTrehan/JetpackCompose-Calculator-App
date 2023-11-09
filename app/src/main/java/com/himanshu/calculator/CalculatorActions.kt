package com.himanshu.calculator

sealed class CalculatorActions
{
    data class Number(val number: Int):CalculatorActions()
    object AllClear:CalculatorActions()
    object Clear:CalculatorActions()
    object Decimal:CalculatorActions()
    object Calculate:CalculatorActions()
    data class Operations(val operations: CalculatorOperations):CalculatorActions()

}
