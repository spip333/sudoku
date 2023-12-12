package com.nstern.sudoku.step1

import org.junit.jupiter.api.Test

class Array3x3GeneratorTest{

    val sut = Array3x3Generator()

    @Test
    fun doTest(){
        val result = sut.generate3x3Array()
    }
}