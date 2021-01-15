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
                fun thenItShouldReturnPositions() {
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
                fun thenItShouldReturnPositions() {
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

        @Nested
        @DisplayName("AND a King at A8")
        inner class AndAPawnAtA8 {
            private val king = King(board)

            @BeforeEach
            fun beforeEach() {
                king.placeAt(Position('A', 8))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [A7, B7, B8]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('A', 7),
                                    Position('B', 7),
                                    Position('B', 8),
                            ),
                            king.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a King at D1")
        inner class AndAPawnAtD1 {
            private val king = King(board)

            @BeforeEach
            fun beforeEach() {
                king.placeAt(Position('D', 1))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [E1, E2, D2, C1, C2]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('E', 1),
                                    Position('E', 2),
                                    Position('D', 2),
                                    Position('C', 1),
                                    Position('C', 2),
                            ),
                            king.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a King at D4")
        inner class AndAPawnAtD4 {
            private val king = King(board)

            @BeforeEach
            fun beforeEach() {
                king.placeAt(Position('D', 4))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [D3, E3, E4, E5, D5, C5, C4, C3]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('D', 3),
                                    Position('E', 3),
                                    Position('E', 4),
                                    Position('E', 5),
                                    Position('D', 5),
                                    Position('C', 5),
                                    Position('C', 4),
                                    Position('C', 3),
                            ),
                            king.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a King at D8")
        inner class AndAPawnAtD8 {
            private val king = King(board)

            @BeforeEach
            fun beforeEach() {
                king.placeAt(Position('D', 8))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [C8, C7, D7, E7, E8]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('E', 8),
                                    Position('E', 7),
                                    Position('D', 7),
                                    Position('C', 7),
                                    Position('C', 8),
                            ),
                            king.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a King at H1")
        inner class AndAPawnAtH1 {
            private val king = King(board)

            @BeforeEach
            fun beforeEach() {
                king.placeAt(Position('H', 1))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [H2, G1, G2]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('H', 2),
                                    Position('G', 1),
                                    Position('G', 2),
                            ),
                            king.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a King at H4")
        inner class AndAPawnAtH4 {
            private val king = King(board)

            @BeforeEach
            fun beforeEach() {
                king.placeAt(Position('H', 4))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [H3, G3, G4, G5, H5]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('H', 3),
                                    Position('G', 3),
                                    Position('G', 4),
                                    Position('G', 5),
                                    Position('H', 5),
                            ),
                            king.nextMoves()
                    )
                }
            }
        }

        @Nested
        @DisplayName("AND a King at H8")
        inner class AndAPawnAtH8 {
            private val king = King(board)

            @BeforeEach
            fun beforeEach() {
                king.placeAt(Position('H', 8))
            }

            @Nested
            @DisplayName("WHEN next moves are requested")
            inner class WhenNextMovesAreRequested {

                @Test
                @DisplayName("THEN it should return [G8, G7, H7]")
                fun thenItShouldReturnPositions() {
                    Assertions.assertEquals(
                            setOf(
                                    Position('H', 7),
                                    Position('G', 8),
                                    Position('G', 7),
                            ),
                            king.nextMoves()
                    )
                }
            }
        }
    }
}