package com.test.chess.domain

data class Position(val row: Char, val column: Int) {
    fun top(): Position? {
        return make(row + 1, column)
    }

    fun topLeft(): Position? {
        return make(row + 1, column - 1)
    }

    fun topRight(): Position? {
        return make(row + 1, column + 1)
    }

    fun left(): Position? {
        return make(row, column - 1)
    }

    fun right(): Position? {
        return make(row, column + 1)
    }

    fun bottom(): Position? {
        return make(row - 1, column)
    }

    fun bottomRight(): Position? {
        return make(row - 1, column + 1)
    }

    fun bottomLeft(): Position? {
        return make(row - 1, column - 1)
    }

    fun valid(): Boolean {
        return valid(row, column)
    }

    override fun toString(): String {
        return row.toString() + column.toString()
    }
    companion object {
        private const val START_ROW = 'A'
        private const val END_ROW = 'H'
        private const val START_CELL = 1
        private const val END_CELL = 8

        private fun valid(row: Char, column: Int): Boolean {
            return row in START_ROW..END_ROW && column in START_CELL..END_CELL
        }

        private fun make(nextRow: Char, nextColumn: Int): Position? {
            return if (valid(nextRow, nextColumn)) Position(nextRow, nextColumn) else null
        }
    }
}
