package com.test.chess.domain

class Bishop(board: Board) {
    private lateinit var current: Position

    fun placeAt(position: Position) {
        this.current = position
    }

    fun nextMoves(): Set<Position> {
        return (current.leftDiagonal() + current.rightDiagonal()).toSet()
    }
}
