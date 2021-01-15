package com.test.chess.extensions

import com.test.chess.domain.Position
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource


class PositionExtensionsKtTest {
    @ParameterizedTest
    @MethodSource("rowSource")
    fun testRow(position: Position, expected: Set<Position>) {
        assertEquals(expected, position.row())
    }

    @ParameterizedTest
    @MethodSource("columnSource")
    fun testColumn(position: Position, expected: Set<Position>) {
        assertEquals(expected, position.column())
    }

    @ParameterizedTest
    @MethodSource("leftDiagonalSource")
    fun testLeftDiagonal(position: Position, expected: Set<Position>) {
        assertEquals(expected, position.leftDiagonal())
    }

    @ParameterizedTest
    @MethodSource("rightDiagonalSource")
    fun testRightDiagonal(position: Position, expected: Set<Position>) {
        assertEquals(expected, position.rightDiagonal())
    }

    companion object {
        @JvmStatic
        fun rowSource(): List<Arguments> {
            val rowA = setOf(
                    Position('A', 1),
                    Position('A', 2),
                    Position('A', 3),
                    Position('A', 4),
                    Position('A', 5),
                    Position('A', 6),
                    Position('A', 7),
                    Position('A', 8)
            )
            return listOf(
                    Arguments.of(Position('A', 1), rowA),
                    Arguments.of(Position('A', 8), rowA),
            )
        }

        @JvmStatic
        fun columnSource(): List<Arguments> {
            val column1 = setOf(
                    Position('A', 1),
                    Position('B', 1),
                    Position('C', 1),
                    Position('D', 1),
                    Position('E', 1),
                    Position('F', 1),
                    Position('G', 1),
                    Position('H', 1)
            )
            return listOf(
                    Arguments.of(Position('A', 1), column1),
                    Arguments.of(Position('H', 1), column1),
            )
        }

        @JvmStatic
        fun leftDiagonalSource(): List<Arguments> {
            val diagonalA1H8 = setOf(
                    Position('A', 1),
                    Position('B', 2),
                    Position('C', 3),
                    Position('D', 4),
                    Position('E', 5),
                    Position('F', 6),
                    Position('G', 7),
                    Position('H', 8)
            )
            return listOf(
                    Arguments.of(Position('A', 1), diagonalA1H8),
                    Arguments.of(Position('H', 8), diagonalA1H8),
            )
        }

        @JvmStatic
        fun rightDiagonalSource(): List<Arguments> {
            val diagonalA8H1 = setOf(
                    Position('A', 8),
                    Position('B', 7),
                    Position('C', 6),
                    Position('D', 5),
                    Position('E', 4),
                    Position('F', 3),
                    Position('G', 2),
                    Position('H', 1)
            )
            return listOf(
                    Arguments.of(Position('A', 8), diagonalA8H1),
                    Arguments.of(Position('H', 1), diagonalA8H1),
            )
        }
    }
}