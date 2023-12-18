package com.nstern.sudoku.step1

class Array3x3Generator {

    val nums = (1..9).toList()
    val numsShort = mutableListOf(1, 2, 3)

    fun generate3x3Array(): Array<IntArray> {
        val s = nums.toList().shuffled()
        val num1 = s.subList(0, 3).toIntArray()
        val num2 = s.subList(3, 6).toIntArray()
        val num3 = s.subList(6, 9).toIntArray()

        val result = arrayOf(num1, num2, num3)
        return result
    }

    fun generateSudokuGrid(): List<List<Int>> {
        val usableElements: MutableList<Int> = mutableListOf()
        usableElements.addAll(numsShort)

        val col1: List<Int> = numsShort.shuffled()
        val col2: MutableList<Int> = mutableListOf()
        val col3: MutableList<Int> = mutableListOf()

        usableElements.remove(col1.get(0))
        col2.add(usableElements.random())
        usableElements.remove(col2.get(0))
        usableElements.add(col1.get(0))
        col2.add(usableElements.random())
        usableElements.remove(col2.get(1))
        col2.add(usableElements.get(0))

        val tmp1: MutableList<Int> = mutableListOf()
        tmp1.addAll(numsShort)
        tmp1.remove(col1[0])
        tmp1.remove(col2[0])
        col3.add(tmp1.get(0))

        val tmp2: MutableList<Int> = mutableListOf()
        tmp2.addAll(numsShort)
        tmp2.remove(col1[1])
        tmp2.remove(col2[1])
        col3.add(tmp2.get(0))

        val tmp3: MutableList<Int> = mutableListOf()
        tmp3.addAll(numsShort)
        tmp3.remove(col3[0])
        tmp3.remove(col3[1])
        col3.add(tmp3.get(0))

        return mutableListOf(col1, col2, col3)
    }
}