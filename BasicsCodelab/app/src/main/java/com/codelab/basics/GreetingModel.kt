package com.codelab.basics

internal data class GreetingModel(
    val name: String,
    val isExpanded: Boolean
) {
    val textRes: Int
        get() = if (isExpanded) R.string.show_less else R.string.show_more
    val extraTextRes: Int
        get() = R.string.lorem_ipsum
    val timesToRepeat: Int
        get() = 4
}
