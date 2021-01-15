package com.test.chess.domain

class Horse(board: Board) : Piece {
    private lateinit var current: Position

    fun placeAt(position: Position) {
        this.current = position
    }

    override fun nextMoves(): Set<Position> {
        return listOfNotNull(
                current.top()?.top()?.right(),
                current.right()?.right()?.top(),
                current.top()?.top()?.left(),
                current.left()?.left()?.top()
        ).toSet()
    }
}
