package minesweeper

import minesweeper.domain.board.size.MineSweeperBoard
import minesweeper.ui.InputView
import minesweeper.ui.OutputView

fun main() {
    OutputView.enterHeight()
    val height = InputView.inputMineSweeperGameValue()
    OutputView.enterWidth()
    val width = InputView.inputMineSweeperGameValue()
    OutputView.enterMineCount()
    val mineCount = InputView.inputMineSweeperGameValue()
    val mineSweeperBoard = MineSweeperBoard(width = width, height = height)

    val mineSweeper = MineSweeper(board = mineSweeperBoard, mineCount = mineCount)
    OutputView.startMineSweeper()

    val mineSweeperInitializer = mineSweeper.initialize()
    OutputView.mineSweeperInitializePrinter(mineSweeperInitializer)
}
