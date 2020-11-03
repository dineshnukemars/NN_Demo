package com.sky.nn

import kotlin.math.pow

private fun getRandActivation(): Double = (Math.random() * 0.5)
private fun getRandWeight(): Double = (Math.random() * 0.1)
private fun getRandBias(): Double = (Math.random() * 0.9)

data class Signal(val activation: Double, var weight: Double = getRandWeight())
data class Neuron(val inputSignals: List<Signal>, val bias: Double = getRandBias(), var activation: Double = 0.0)

data class Layer(val neurons: List<Neuron>)

fun sigmoid(totalStrength: Double): Double {
    val denominator = 1 + Math.E.pow(-1.0 * totalStrength)
    return 1 / denominator
}

fun main() {

    val startSignals = getStartSignal()

    val neuronsL1 = getNeurons(startSignals)
    calculateActivations(neuronsL1)

    val neuronsL2 = getNeurons(neuronsL1.map { Signal(it.activation) })
    calculateActivations(neuronsL2)

    val neuronsL3 = getNeurons(neuronsL1.map { Signal(it.activation) })
    calculateActivations(neuronsL3)

    val neuronsL4 = getNeurons(neuronsL1.map { Signal(it.activation) })
    calculateActivations(neuronsL4)

}

private fun getStartSignal(): List<Signal> {
    return listOf(
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
        Signal(getRandActivation()),
    )
}

fun matCal() {
    //    Q(Wa(0)+b)
//    val matrix = SimpleMatrix(3, 3)
//    matrix.set(0, 0, 22.0)
//    matrix.print()
}

private fun calculateActivations(neurons: List<Neuron>) {
    neurons.forEachIndexed { i, neuron ->
        var sumStrength = 0.0
        neuron.inputSignals.forEachIndexed { si, signal ->
            sumStrength += signal.weight * signal.activation
        }
        val totalStrength = sumStrength + neuron.bias
        neuron.activation = sigmoid(totalStrength)
        printNeuron(neuron)
    }
    println()
}

private fun getNeurons(signals: List<Signal>): List<Neuron> {
    val neurons = listOf(
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
        Neuron(inputSignals = signals),
    )
    return neurons
}