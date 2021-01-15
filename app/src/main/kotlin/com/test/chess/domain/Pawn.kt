package com.test.chess.domain

class Pawn(private val board: Board): Piece {
    private lateinit var current: Position

    fun placeAt(position: Position) {
        this.current = position
    }

    override fun nextMoves(): Set<Position> {
        return listOfNotNull(current.top(),
                current.topLeft(),
                current.topRight()).toSet()
    }
}
