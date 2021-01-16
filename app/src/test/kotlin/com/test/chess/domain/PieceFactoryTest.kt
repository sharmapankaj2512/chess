package com.test.chess.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.reflect.KClass

class PieceFactoryTest {
    @ParameterizedTest
    @MethodSource("validCommandSource")
    fun shouldReturnKing(command: String, pieceType: KClass<Piece>) {
        assertEquals(pieceType, PieceFactory.make(command)!!::class)
    }

    @ParameterizedTest
    @MethodSource("invalidCommandSource")
    fun shouldReturnNothingWhenTheCommandIsInvalid(command: String) {
        assertNull(PieceFactory.make(command))
    }

    companion object {
        @JvmStatic
        fun validCommandSource(): List<Arguments> {
            return listOf(
                    Arguments.of("King A1", King::class),
                    Arguments.of("King a1", King::class),
                    Arguments.of("queen a1", Queen::class),
                    Arguments.of("horse a1", Horse::class),
                    Arguments.of("bishop a1", Bishop::class),
                    Arguments.of("rook a1", Rook::class),
                    Arguments.of("pawn a1", Pawn::class),
            )
        }

        @JvmStatic
        fun invalidCommandSource(): List<Arguments> {
            return listOf(
                    Arguments.of("King "),
                    Arguments.of(" "),
                    Arguments.of(""),
                    Arguments.of("rat"),
            )
        }
    }
}