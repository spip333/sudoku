package com.nstern.sudoku.step1

class Array3x3Generator {

    val nums = (1..9).toList()

    fun generate3x3Array(): Array<IntArray>{
        val s = nums.shuffled()
        val num1 = s.subList(0,3).toIntArray()
        val num2 = s.subList(3,6).toIntArray()
        val num3 = s.subList(6,9).toIntArray()

        val result = arrayOf(num1, num2, num3)
        return result
    }

    fun generateSudokuGrid(): Array<Array<IntArray>>{
        val result = arrayOf(
            generate3x3Array(),
            generate3x3Array(),
            generate3x3Array(),
            generate3x3Array(),
            generate3x3Array(),
            generate3x3Array(),
            generate3x3Array(),
            generate3x3Array(),
            generate3x3Array())
        return result
    }
}