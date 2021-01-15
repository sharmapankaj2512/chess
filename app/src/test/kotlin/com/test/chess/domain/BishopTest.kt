package com.test.chess.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class BishopTest {
    @Nested
    @DisplayName("GIVEN an empty chess board")
    inner class GivenEmptyChessBoard {
        private val board = Board()

        @Nested
        @DisplayName("AND a Bishop at A1")
        inner class AndABishopAtA1 {
            private val bishop = Bishop(board)

            @BeforeEach
            fun beforeEach() {
                bishop.placeAt(Position('A', 1))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [A1, B2, C3, D4, E5, F6, G7, H8]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('A', 1),
                                    Position('B', 2),
                                    Position('C', 3),
                                    Position('D', 4),
                                    Position('E', 5),
                                    Position('F', 6),
                                    Position('G', 7),
                                    Position('H', 8),
                            ),
                            bishop.nextMoves()
                    )
                }
            }
        }
    }
}