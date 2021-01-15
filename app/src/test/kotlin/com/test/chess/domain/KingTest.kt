package com.test.chess.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class KingTest {
    @Nested
    @DisplayName("GIVEN an empty chess board")
    inner class GivenEmptyChessBoard {
        private val board = Board()

        @Nested
        @DisplayName("AND a King at A1")
        inner class AndAPawnAtA1 {
            private val king = King(board)

            @BeforeEach
            fun beforeEach() {
                king.placeAt(Position('A', 1))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [A2, B1, B2]")
                fun thenItShouldReturnC1C2C3() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('B', 1),
                                    Position('B', 2),
                                    Position('A', 2)
                            ),
                            king.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a King at A5")
        inner class AndAPawnAtA5 {
            private val king = King(board)

            @BeforeEach
            fun beforeEach() {
                king.placeAt(Position('A', 5))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [A4, A6, B4, B5, B6]")
                fun thenItShouldReturnC1C2C3() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('A', 4),
                                    Position('B', 4),
                                    Position('B', 5),
                                    Position('B', 6),
                                    Position('A', 6),
                            ),
                            king.nextMoves()
                    )
                }
            }
        }
    }
}