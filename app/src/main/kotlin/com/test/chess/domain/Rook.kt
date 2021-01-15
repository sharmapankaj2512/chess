package com.test.chess.domain

class Rook(board: Board): Piece {
    private lateinit var current: Position

    fun placeAt(position: Position) {
        this.current = position
    }

    override fun nextMoves(): Set<Position> {
        return current.row() + current.column()
    }
}
