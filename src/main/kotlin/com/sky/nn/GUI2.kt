package com.sky.nn

import java.awt.Color
import java.awt.Graphics
import java.awt.Graphics2D
import javax.swing.JFrame
import javax.swing.JPanel
import kotlin.concurrent.thread

class GUI {

    init {
        val jFrame = JFrame()
        jFrame.setSize(1000, 1000)
        jFrame.isVisible = true
        jFrame.layout = null
        jFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        val drawingBoard = DrawingBoard(NeuralState())
        jFrame.add(drawingBoard)
        thread {
            for (i in 0..10000) {
                drawingBoard.repaint()
                Thread.sleep(17)
            }
        }
    }
}

class DrawingBoard(val neuralState: NeuralState) : JPanel() {

    var i = 0
    var timeElapsed = System.currentTimeMillis()

    init {
        layout = null
        setBounds(0, 0, 1000, 1000)
    }

    override fun paintComponent(graphics: Graphics) {
        super.paintComponent(graphics)
        val g = graphics as Graphics2D
        g.drawNeural(neuralState)

        val j = i % 60
        if (j == 0) {
            val currentTimeMillis = System.currentTimeMillis()
            val timeFor60Frames = currentTimeMillis - timeElapsed
            println(timeFor60Frames)
            timeElapsed = currentTimeMillis
        }
        i++
    }

    private fun Graphics2D.drawNeural(neuralState: NeuralState) {
        neuralState.objList.forEach {
            color = Color.BLUE
            fillOval(it.x, it.y, 50, 50)
        }
    }
}

class NeuralState {

    val objList = ArrayList<NeuralShape>()

    init {
        objList.add(NeuralShape())
        objList.add(NeuralShape())
        objList.add(NeuralShape())
        objList.add(NeuralShape())
        objList.add(NeuralShape())
        objList.add(NeuralShape())
        objList.add(NeuralShape())
        objList.add(NeuralShape())
        objList.add(NeuralShape())

        thread {
            for (i in 0..1000) {
                objList.forEach {
                    it.x = if (it.x > 600) 0
                    else it.x + 1
                }
                Thread.sleep(10)
            }
        }
    }
}

data class NeuralShape(
    val color: Color = Color.ORANGE,
    @Volatile var x: Int = (Math.random() * 100).toInt(),
    @Volatile var y: Int = (Math.random() * 800).toInt()
)

fun main() {
    GUI()
}