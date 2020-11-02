package com.sky.nn

// Reset
const val RESET = "\u001b[0m" // Text Reset

// Regular Colors
const val WHITE = "\u001b[0;30m" // BLACK
const val GREY = "\u001b[0;37m" // WHITE
const val RED = "\u001b[0;31m" // RED
const val GREEN = "\u001b[0;32m" // GREEN
const val YELLOW = "\u001b[0;33m" // YELLOW
const val BLUE = "\u001b[0;34m" // BLUE
const val PURPLE = "\u001b[0;35m" // PURPLE
const val CYAN = "\u001b[0;36m" // CYAN


// Bold
const val BLACK_BOLD = "\u001b[1;30m" // BLACK
const val RED_BOLD = "\u001b[1;31m" // RED
const val GREEN_BOLD = "\u001b[1;32m" // GREEN
const val YELLOW_BOLD = "\u001b[1;33m" // YELLOW
const val BLUE_BOLD = "\u001b[1;34m" // BLUE
const val PURPLE_BOLD = "\u001b[1;35m" // PURPLE
const val CYAN_BOLD = "\u001b[1;36m" // CYAN
const val WHITE_BOLD = "\u001b[1;37m" // WHITE


// Underline
const val BLACK_UNDERLINED = "\u001b[4;30m" // BLACK
const val RED_UNDERLINED = "\u001b[4;31m" // RED
const val GREEN_UNDERLINED = "\u001b[4;32m" // GREEN
const val YELLOW_UNDERLINED = "\u001b[4;33m" // YELLOW
const val BLUE_UNDERLINED = "\u001b[4;34m" // BLUE
const val PURPLE_UNDERLINED = "\u001b[4;35m" // PURPLE
const val CYAN_UNDERLINED = "\u001b[4;36m" // CYAN
const val WHITE_UNDERLINED = "\u001b[4;37m" // WHITE


// Background
const val BLACK_BACKGROUND = "\u001b[40m" // BLACK
const val RED_BACKGROUND = "\u001b[41m" // RED
const val GREEN_BACKGROUND = "\u001b[42m" // GREEN
const val YELLOW_BACKGROUND = "\u001b[43m" // YELLOW
const val BLUE_BACKGROUND = "\u001b[44m" // BLUE
const val PURPLE_BACKGROUND = "\u001b[45m" // PURPLE
const val CYAN_BACKGROUND = "\u001b[46m" // CYAN
const val WHITE_BACKGROUND = "\u001b[47m" // WHITE


// High Intensity
const val BLACK_BRIGHT = "\u001b[0;90m" // BLACK
const val RED_BRIGHT = "\u001b[0;91m" // RED
const val GREEN_BRIGHT = "\u001b[0;92m" // GREEN
const val YELLOW_BRIGHT = "\u001b[0;93m" // YELLOW
const val BLUE_BRIGHT = "\u001b[0;94m" // BLUE
const val PURPLE_BRIGHT = "\u001b[0;95m" // PURPLE
const val CYAN_BRIGHT = "\u001b[0;96m" // CYAN
const val WHITE_BRIGHT = "\u001b[0;97m" // WHITE


// Bold High Intensity
const val BLACK_BOLD_BRIGHT = "\u001b[1;90m" // BLACK
const val RED_BOLD_BRIGHT = "\u001b[1;91m" // RED
const val GREEN_BOLD_BRIGHT = "\u001b[1;92m" // GREEN
const val YELLOW_BOLD_BRIGHT = "\u001b[1;93m" // YELLOW
const val BLUE_BOLD_BRIGHT = "\u001b[1;94m" // BLUE
const val PURPLE_BOLD_BRIGHT = "\u001b[1;95m" // PURPLE
const val CYAN_BOLD_BRIGHT = "\u001b[1;96m" // CYAN
const val WHITE_BOLD_BRIGHT = "\u001b[1;97m" // WHITE


// High Intensity backgrounds
const val BLACK_BACKGROUND_BRIGHT = "\u001b[0;100m" // BLACK
const val RED_BACKGROUND_BRIGHT = "\u001b[0;101m" // RED
const val GREEN_BACKGROUND_BRIGHT = "\u001b[0;102m" // GREEN
const val YELLOW_BACKGROUND_BRIGHT = "\u001b[0;103m" // YELLOW
const val BLUE_BACKGROUND_BRIGHT = "\u001b[0;104m" // BLUE
const val PURPLE_BACKGROUND_BRIGHT = "\u001b[0;105m" // PURPLE
const val CYAN_BACKGROUND_BRIGHT = "\u001b[0;106m" // CYAN
const val WHITE_BACKGROUND_BRIGHT = "\u001b[0;107m" // WHITE

fun printNeuron(neuron: Neuron) {
    val color = when (neuron.activation) {
        in 0.0..0.09 -> GREY
        in 0.1..0.19 -> GREY
        in 0.2..0.29 -> BLUE
        in 0.3..0.39 -> BLUE
        in 0.4..0.49 -> GREEN
        in 0.5..0.59 -> GREEN
        in 0.6..0.69 -> YELLOW
        in 0.7..0.79 -> YELLOW
        in 0.8..0.89 -> RED
        in 0.9..1.0 -> RED
        else -> GREY
    }
    val activationText = String.format("%.2f", neuron.activation)
    print("$color$activationText$RESET ")
}

fun main() {
    val message = sigmoid(00.0)
    println(message)
    print("$BLUE dinesh $RESET $BLUE bhuvanesh")
}
