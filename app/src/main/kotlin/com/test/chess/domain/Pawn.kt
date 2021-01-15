package com.test.chess.domain

class Pawn(private val board: Board): Piece {
    private lateinit var currentPosition: Position

    fun placeAt(position: Position) {
        this.currentPosition = position
    }

    override fun nextMoves(): Set<Position> {
        return listOfNotNull(currentPosition.above(),
                currentPosition.aboveToLeft(),
                currentPosition.aboveToRight()).toSet()
    }
}
