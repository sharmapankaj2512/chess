package com.test.chess.domain

interface Piece {
    fun nextMoves(): Set<Position>
}