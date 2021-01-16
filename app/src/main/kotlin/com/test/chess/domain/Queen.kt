package com.test.chess.domain

import com.test.chess.extensions.column
import com.test.chess.extensions.leftDiagonal
import com.test.chess.extensions.rightDiagonal
import com.test.chess.extensions.row

class Queen(board: Board): Piece {
    private lateinit var current: Position

    fun placeAt(position: Position) {
        this.current = position
    }

    override fun nextMoves(): Set<Position> {
        return (current.row() +
                current.column() +
                current.leftDiagonal() +
                current.rightDiagonal()).toSet()
    }
}
