package com.test.chess.domain

class King(board: Board) : Piece {
    private lateinit var current: Position

    fun placeAt(position: Position) {
        this.current = position
    }

    override fun nextMoves(): Set<Position> {
        return listOfNotNull(
                current.above(),
                current.right(),
                current.aboveToRight()
        ).toSet()
    }
}