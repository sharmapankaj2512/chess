package com.test.chess.domain

class King(board: Board) : Piece {
    private lateinit var current: Position

    fun placeAt(position: Position) {
        this.current = position
    }

    override fun nextMoves(): Set<Position> {
        return listOfNotNull(
                current.top(),
                current.bottom(),
                current.right(),
                current.left(),
                current.topRight(),
                current.topLeft(),
                current.bottomRight(),
                current.bottomLeft(),
        ).toSet()
    }
}