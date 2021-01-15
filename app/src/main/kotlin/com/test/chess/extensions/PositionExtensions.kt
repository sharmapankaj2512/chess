package com.test.chess.extensions

import com.test.chess.domain.Position

fun Position.row(): Set<Position> {
    val leftwards = generateSequence(this) { it.left() }
    val rightwards = generateSequence(this) { it.right() }
    val row = leftwards + rightwards
    return row.takeWhile { it.valid() }.toSet()
}

fun Position.column(): Set<Position> {
    val downwards = generateSequence(this) { it.bottom() }
    val upwards = generateSequence(this) { it.top() }
    val column = upwards + downwards
    return column.takeWhile { it.valid() }.toSet()
}

fun Position.leftDiagonal(): Set<Position> {
    val downwards = generateSequence(this) { it.bottomLeft() }
    val upwards = generateSequence(this) { it.topRight() }
    val diagonal = upwards + downwards
    return diagonal.takeWhile { it.valid() }.toSet()
}

fun Position.rightDiagonal(): Set<Position> {
    val downwards = generateSequence(this) { it.bottomRight() }
    val upwards = generateSequence(this) { it.topLeft() }
    val diagonal = upwards + downwards
    return diagonal.takeWhile { it.valid() }.toSet()
}