package com.test.chess.domain

data class Position(val row: Char, val column: Int) {
    fun above(): Position? {
        val nextRow = row + 1
        val nextColumn = column
        return if (valid(nextRow, nextColumn)) Position(nextRow, nextColumn) else null
    }

    fun aboveToLeft(): Position? {
        val nextRow = row + 1
        val nextColumn = column - 1
        return if (valid(nextRow, nextColumn)) Position(nextRow, nextColumn) else null
    }

    fun aboveToRight(): Position? {
        val nextRow = row + 1
        val nextColumn = column + 1
        return if (valid(nextRow, nextColumn)) Position(nextRow, nextColumn) else null
    }

    fun right(): Position? {
        val nextRow = row
        val nextColumn = column + 1
        return if (valid(nextRow, nextColumn)) Position(nextRow, nextColumn) else null
    }

    private fun valid(row: Char, column: Int): Boolean {
        return row in START_ROW..END_ROW && column in START_CELL..END_CELL
    }

    companion object {
        const val START_ROW = 'A'
        const val END_ROW = 'H'
        const val START_CELL = 1
        const val END_CELL = 8
    }
}
