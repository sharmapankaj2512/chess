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

    fun row(): Set<Position> {
        return (START_CELL..END_CELL)
                .map { column -> Position(row, column) }
                .toSet()
    }

    fun column(): Set<Position> {
        return (START_ROW..END_ROW)
                .map { row -> Position(row, column) }
                .toSet()
    }

    fun leftDiagonal(): Set<Position> {
        val downwards = generateSequence(this) { it.bottomLeft() }
        val upwards = generateSequence(this) { it.topRight() }
        val diagonal = upwards + downwards
        return diagonal.takeWhile { valid(it) }.toSet()
    }

    fun rightDiagonal(): Set<Position> {
        val downwards = generateSequence(this) { it.bottomRight() }
        val upwards = generateSequence(this) { it.topLeft() }
        val diagonal = upwards + downwards
        return diagonal.takeWhile { valid(it) }.toSet()
    }

    private fun make(nextRow: Char, nextColumn: Int): Position? {
        return if (valid(nextRow, nextColumn)) Position(nextRow, nextColumn) else null
    }

    private fun valid(row: Char, column: Int): Boolean {
        return row in START_ROW..END_ROW && column in START_CELL..END_CELL
    }

    private fun valid(position: Position): Boolean {
        return  valid(position.row, position.column)
    }

    companion object {
        const val START_ROW = 'A'
        const val END_ROW = 'H'
        const val START_CELL = 1
        const val END_CELL = 8
    }
}
