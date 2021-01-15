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

        @Nested
        @DisplayName("AND a Bishop at A8")
        inner class AndABishopAtA8 {
            private val bishop = Bishop(board)

            @BeforeEach
            fun beforeEach() {
                bishop.placeAt(Position('A', 8))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [A8, B7, C6, D5, E4, F3, G2, H1]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('A', 8),
                                    Position('B', 7),
                                    Position('C', 6),
                                    Position('D', 5),
                                    Position('E', 4),
                                    Position('F', 3),
                                    Position('G', 2),
                                    Position('H', 1),
                            ),
                            bishop.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a Bishop at E2")
        inner class AndABishopAtE2 {
            private val bishop = Bishop(board)

            @BeforeEach
            fun beforeEach() {
                bishop.placeAt(Position('E', 2))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [D1, E2, F3, G4, H5, F1, D3, C4, B5, A6]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('D', 1),
                                    Position('E', 2),
                                    Position('F', 3),
                                    Position('G', 4),
                                    Position('H', 5),
                                    Position('F', 1),
                                    Position('D', 3),
                                    Position('C', 4),
                                    Position('B', 5),
                                    Position('A', 6),
                            ),
                            bishop.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a Bishop at E5")
        inner class AndABishopAtE5 {
            private val bishop = Bishop(board)

            @BeforeEach
            fun beforeEach() {
                bishop.placeAt(Position('E', 5))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [A1, B2, C3, D4, E5, F6, G7, H8, B8, C7, D6, F4, G3, H2]")
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
                                    Position('B', 8),
                                    Position('C', 7),
                                    Position('D', 6),
                                    Position('F', 4),
                                    Position('G', 3),
                                    Position('H', 2),
                            ),
                            bishop.nextMoves()
                    )
                }
            }
        }
    }
}