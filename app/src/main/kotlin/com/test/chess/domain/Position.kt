package com.test.chess.domain

data class Position(val row: Char, val column: Int) {
    fun above(): Position? {
        return Position(row + 1, column)
    }

    fun aboveToLeft(): Position? {
        return Position(row + 1, column - 1)
    }

    fun aboveToRight(): Position? {
        return Position(row + 1, column + 1)
    }
}
