package com.test.chess.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class RookTest {
    @Nested
    @DisplayName("GIVEN an empty chess board")
    inner class GivenEmptyChessBoard {
        private val board = Board()

        @Nested
        @DisplayName("AND a Rook at A1")
        inner class AndARookAtA1 {
            private val rook = Rook(board)

            @BeforeEach
            fun beforeEach() {
                rook.placeAt(Position('A', 1))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [A1, A2, A3, A4, A5, A6, A7, A8, B1, C1, D1, E1, F1, G1, H1]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('A', 1),
                                    Position('A', 2),
                                    Position('A', 3),
                                    Position('A', 4),
                                    Position('A', 5),
                                    Position('A', 6),
                                    Position('A', 7),
                                    Position('A', 8),
                                    Position('B', 1),
                                    Position('C', 1),
                                    Position('D', 1),
                                    Position('E', 1),
                                    Position('F', 1),
                                    Position('G', 1),
                                    Position('H', 1),
                            ),
                            rook.nextMoves()
                    )
                }
            }
        }
    }
}