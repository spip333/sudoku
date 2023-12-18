package com.nstern.sudoku.step1

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class Array3x3GeneratorTest {

    val sut = Array3x3Generator()

    @Test
    fun generate3x3ArrayAlwaysCreatesAnArrray3x3Containing9numbers() {
        val result = sut.generate3x3Array()
        val checkResultSet: MutableSet<Int?> = mutableSetOf<Int?>()

        for (i in 0..2) {
            checkResultSet.addAll(result[i].toSet())
        }
        val nums = (1..9).toList()
        assertThat(checkResultSet).containsAll(nums)
        assertThat(checkResultSet.size).isEqualTo(9)
    }

    @Test
    fun generateSudokuGridShouldGenerateAnArrayOf9x9() {
        val domain: List<Int> = listOf(1, 2, 3)
        val result = sut.generateSudokuGrid()
        assertThat(result.size).isEqualTo(3)
        for (i in 1..2) {
            for (j in 1..2) {
                assertThat(result[j]).containsAll(domain)
            }
        }
    }

}
