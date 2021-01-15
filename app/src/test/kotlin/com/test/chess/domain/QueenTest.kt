package com.test.chess.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class QueenTest {
    @Nested
    @DisplayName("GIVEN an empty chess board")
    inner class GivenEmptyChessBoard {
        private val board = Board()

        @Nested
        @DisplayName("AND a Queen at D4")
        inner class AndABishopAtD4 {
            private val queen = Queen(board)

            @BeforeEach
            fun beforeEach() {
                queen.placeAt(Position('D', 4))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [D1..D8, A4..H4, A1..B2..G7..H8, A7..B6..F2..G1]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('D', 1),
                                    Position('D', 2),
                                    Position('D', 3),
                                    Position('D', 4),
                                    Position('D', 5),
                                    Position('D', 6),
                                    Position('D', 7),
                                    Position('D', 8),
                                    Position('A', 4),
                                    Position('B', 4),
                                    Position('C', 4),
                                    Position('E', 4),
                                    Position('F', 4),
                                    Position('G', 4),
                                    Position('H', 4),
                                    Position('A', 1),
                                    Position('B', 2),
                                    Position('C', 3),
                                    Position('D', 4),
                                    Position('E', 5),
                                    Position('F', 6),
                                    Position('G', 7),
                                    Position('H', 8),
                                    Position('A', 7),
                                    Position('B', 6),
                                    Position('C', 5),
                                    Position('D', 4),
                                    Position('E', 3),
                                    Position('F', 2),
                                    Position('G', 1),
                            ),
                            queen.nextMoves()
                    )
                }
            }
        }
    }
}