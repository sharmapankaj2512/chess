package com.test.chess

import com.test.chess.domain.PieceFactory

class App {
    fun repl() {
        while(true) {
            println("Enter command:")
            readLine()?.let { command ->
                process(command)
            } ?: kotlin.run {
                println("Invalid command")
            }
        }
    }

    private fun process(it: String): Unit? {
        return PieceFactory.make(it.trim())?.let { piece ->
            println(piece.nextMoves())
        }
    }
}


fun main() {
    App().repl()
}