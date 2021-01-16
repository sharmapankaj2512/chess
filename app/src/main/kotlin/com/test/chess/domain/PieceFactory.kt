package com.test.chess.domain

object PieceFactory {
    private val COMMAND = """^(\bking\b|\bqueen\b|\brook\b|\bbishop\b|\bhorse\b|\bpawn\b)\s+([a-h])([1-8])$""".toRegex()

    fun make(command: String): Piece? {
        return COMMAND.matchEntire(command.toLowerCase())?.let { result ->
            val (pieceType, row, column) = result.destructured
            return make(pieceType, row, column)
        }
    }

    private fun make(pieceType: String, row: String, column: String) =
            when (pieceType) {
                "king" -> {
                    val king = King(Board())
                    king.placeAt(Position(row[0], column.toInt()))
                    king
                }
                "queen" -> {
                    val queen = Queen(Board())
                    queen.placeAt(Position(row[0], column.toInt()))
                    queen
                }
                "pawn" -> {
                    val pawn = Pawn(Board())
                    pawn.placeAt(Position(row[0], column.toInt()))
                    pawn
                }
                "rook" -> {
                    val rook = Rook(Board())
                    rook.placeAt(Position(row[0], column.toInt()))
                    rook
                }
                "horse" -> {
                    val horse = Horse(Board())
                    horse.placeAt(Position(row[0], column.toInt()))
                    horse
                }
                "bishop" -> {
                    val bishop = Bishop(Board())
                    bishop.placeAt(Position(row[0], column.toInt()))
                    bishop
                }
                else -> null
            }
}
