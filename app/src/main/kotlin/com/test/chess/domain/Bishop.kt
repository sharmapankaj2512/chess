package com.test.chess.domain

import com.test.chess.extensions.leftDiagonal
import com.test.chess.extensions.rightDiagonal

class Bishop(board: Board): Piece {
    private lateinit var current: Position

    fun placeAt(position: Position) {
        this.current = position
    }

    override fun nextMoves(): Set<Position> {
        return (current.leftDiagonal() + current.rightDiagonal()).toSet()
    }
}
