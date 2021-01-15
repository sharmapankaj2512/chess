package com.test.chess.domain

class Queen(board: Board) {
    private lateinit var current: Position

    fun placeAt(position: Position) {
        this.current = position
    }

    fun nextMoves(): Set<Position> {
        return (current.row() + current.column() + current.leftDiagonal() + current.rightDiagonal()).toSet()
    }
}
