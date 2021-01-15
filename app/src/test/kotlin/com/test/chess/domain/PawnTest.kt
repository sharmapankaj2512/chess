package com.test.chess.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@Nested
@DisplayName("GIVEN an empty chess board")
class GivenEmptyChessBoard {
    private val board = Board()

    @Nested
    @DisplayName("AND a pawn at B2")
    inner class AndAPawnAtB2 {
        private val pawn = Pawn(board)

        @BeforeEach
        fun beforeEach() {
            pawn.placeAt(Position('B', 2))
        }

        @Nested
        @DisplayName("WHEN next moves of the pawn are requested")
        inner class WhenNextMovesAreRequested {

            @Test
            @DisplayName("THEN it should return [C1, C2, C3]")
            fun thenItShouldReturnC1C2C3() {
                assertEquals(
                        setOf(
                                Position('C', 1),
                                Position('C', 2),
                                Position('C', 3)
                        ),
                        pawn.nextMoves()
                )
            }
        }
    }

    @Nested
    @DisplayName("AND a pawn at B1")
    inner class AndAPawnAtB1 {
        private val pawn = Pawn(board)

        @BeforeEach
        fun beforeEach() {
            pawn.placeAt(Position('B', 1))
        }

        @Nested
        @DisplayName("WHEN next moves of the pawn are requested")
        inner class WhenNextMovesAreRequested {

            @Test
            @DisplayName("THEN it should return [C1, C2]")
            fun thenItShouldReturnC1C2() {
                assertEquals(
                        setOf(
                                Position('C', 1),
                                Position('C', 2)
                        ),
                        pawn.nextMoves()
                )
            }
        }
    }

    @Nested
    @DisplayName("AND a pawn at B8")
    inner class AndAPawnAtB8 {
        private val pawn = Pawn(board)

        @BeforeEach
        fun beforeEach() {
            pawn.placeAt(Position('B', 8))
        }

        @Nested
        @DisplayName("WHEN next moves of the pawn are requested")
        inner class WhenNextMovesAreRequested {

            @Test
            @DisplayName("THEN it should return [C7, C8]")
            fun thenItShouldReturnC1C2() {
                assertEquals(
                        setOf(
                                Position('C', 7),
                                Position('C', 8)
                        ),
                        pawn.nextMoves()
                )
            }
        }
    }

    @Nested
    @DisplayName("AND a pawn at H1")
    inner class AndAPawnAtH1 {
        private val pawn = Pawn(board)

        @BeforeEach
        fun beforeEach() {
            pawn.placeAt(Position('H', 1))
        }

        @Nested
        @DisplayName("WHEN next moves of the pawn are requested")
        inner class WhenNextMovesAreRequested {

            @Test
            @DisplayName("THEN it should return []")
            fun thenItShouldReturnC1C2() {
                assertEquals(
                        setOf<Position>(),
                        pawn.nextMoves()
                )
            }
        }
    }
}