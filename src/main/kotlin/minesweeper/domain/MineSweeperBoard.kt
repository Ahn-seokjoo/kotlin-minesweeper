package minesweeper.domain

import minesweeper.domain.board.size.MineSweeperBoardSize

class MineSweeperBoard(
    private val mineSweeperWidths: List<MineSweeperWidth>
) : List<MineSweeperWidth> by mineSweeperWidths {
    companion object {
        fun newInstance(board: MineSweeperBoardSize, mineSweeperList: MineSweeperWidth): MineSweeperBoard {
            return List(board.height) {
                val line = it * board.width
                mineSweeperList.slice(line until line + board.width).toMineSweeperWidth()
            }.toMineSweeperBoard()
        }
    }
}

fun List<MineSweeperWidth>.toMineSweeperBoard() = MineSweeperBoard(this)
