package test

import asteroidCollision
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestSolve {
    @Test
    fun `First test`() {
        val actual = asteroidCollision(intArrayOf(5, 10, -5))
        val expect = intArrayOf(5, 10)
        printAssert(actual, expect)
        assertThat(actual).isEqualTo(expect)
    }

    @Test
    fun `Second test`() {
        val actual = asteroidCollision(intArrayOf(8, -8))
        val expect = intArrayOf()
        printAssert(actual, expect)
        assertThat(actual).isEqualTo(expect)
    }

    @Test
    fun `Third test`() {
        val actual = asteroidCollision(intArrayOf(10, 2, -5))
        val expect = intArrayOf(10)
        printAssert(actual, expect)
        assertThat(actual).isEqualTo(expect)
    }

    @Test
    fun `Fifth test`() {
        val actual = asteroidCollision(intArrayOf(-2, -2, 1, -1))
        val expect = intArrayOf(-2, -2)
        printAssert(actual, expect)
        assertThat(actual).isEqualTo(expect)
    }

    @Test
    fun `Sixth test`() {
        val actual = asteroidCollision(intArrayOf(-2,2,-1,-2))
        val expect = intArrayOf(-2)
        printAssert(actual, expect)
        assertThat(actual).isEqualTo(expect)
    }

    @Test
    fun `Seventh test`() {
        val actual = asteroidCollision(intArrayOf(1,1,-1,-2))
        val expect = intArrayOf(-2)
        printAssert(actual, expect)
        assertThat(actual).isEqualTo(expect)
    }
}