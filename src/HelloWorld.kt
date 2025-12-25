fun HelloWorld() {

    //print() -> prints text WITHOUT moving to new line
    // USE CASE : When you want output on the same line ( e.g., Progress indicators )
    print("Hello World")

    //println() -> prints text AND MOVES CURSER to the next line
    // NOTE : Internally adds a newline character '\n' at the end
    println("Hello World")

    //'\n' -> New line escape character
    // NOTE : Here, print() is used, but '\n' manually forces a line break
    // println("text") == print("text\n")
    print("Hello World\n")

    // 'n' at the START created an empty line before the text
    // EDGE CASE : Multiple '\n' can create blank lines unintentionally
    println("\nHello World")

    // '\t' -> Horizontal tab space
    // USE CASE : Formatting console output into columns
    // NOTE : TAB WIDTH depends upon terminal /editor
    print("Hello\t World")
}