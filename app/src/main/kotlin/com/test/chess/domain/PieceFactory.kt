package com.test.chess.domain

object PieceFactory {
    private val COMMAND = """^(\bking\b|\bqueen\b|\brook\b|\bbishop\b|\bhorse\b|\bpawn\b)\s+([a-h])([1-8])$""".toRegex()

    fun make(command: String): Piece? {
        return COMMAND.matchEntire(command.toLowerCase())?.let { result ->
            val (pieceType, row, column) = result.destructured
            return make(pieceType, row[0].toUpperCase(), column.toInt())
        }
    }

    private fun make(pieceType: String, row: Char, column: Int) =
            when (pieceType) {
                "king" -> {
                    val king = King(Board())
                    king.placeAt(Position(row, column))
                    king
                }
                "queen" -> {
                    val queen = Queen(Board())
                    queen.placeAt(Position(row, column))
                    queen
                }
                "pawn" -> {
                    val pawn = Pawn(Board())
                    pawn.placeAt(Position(row, column))
                    pawn
                }
                "rook" -> {
                    val rook = Rook(Board())
                    rook.placeAt(Position(row, column))
                    rook
                }
                "horse" -> {
                    val horse = Horse(Board())
                    horse.placeAt(Position(row, column))
                    horse
                }
                "bishop" -> {
                    val bishop = Bishop(Board())
                    bishop.placeAt(Position(row, column))
                    bishop
                }
                else -> null
            }
}
