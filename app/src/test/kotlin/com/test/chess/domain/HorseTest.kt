package com.test.chess.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class HorseTest {
    @Nested
    @DisplayName("GIVEN an empty chess board")
    inner class GivenEmptyChessBoard {
        private val board = Board()

        @Nested
        @DisplayName("AND a Horse at A1")
        inner class AndAHorseAtA1 {
            private val horse = Horse(board)

            @BeforeEach
            fun beforeEach() {
                horse.placeAt(Position('A', 1))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [C2, B3]")
                fun thenItShouldReturnPositions() {
                    assertEquals(
                            setOf(
                                    Position('C', 2),
                                    Position('B', 3)
                            ),
                            horse.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a Horse at A8")
        inner class AndAHorseAtA8 {
            private val horse = Horse(board)

            @BeforeEach
            fun beforeEach() {
                horse.placeAt(Position('A', 8))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [C7, B6]")
                fun thenItShouldReturnPositions() {
                    assertEquals(
                            setOf(
                                    Position('C', 7),
                                    Position('B', 6)
                            ),
                            horse.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a Horse at H1")
        inner class AndAHorseAtH1 {
            private val horse = Horse(board)

            @BeforeEach
            fun beforeEach() {
                horse.placeAt(Position('H', 1))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [F2, G3]")
                fun thenItShouldReturnPositions() {
                    assertEquals(
                            setOf(
                                    Position('F', 2),
                                    Position('G', 3)
                            ),
                            horse.nextMoves()
                    )
                }
            }
        }
    }
}