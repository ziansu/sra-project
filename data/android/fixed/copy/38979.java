public static com.alphatica.genotick.ui.UserOutput getUserOutput() {
    if ((com.alphatica.genotick.ui.UserInputOutputFactory.userOutput) == null) {
        com.alphatica.genotick.ui.UserInputOutputFactory.userOutput = new com.alphatica.genotick.ui.ConsoleOutput();
    }
    return com.alphatica.genotick.ui.UserInputOutputFactory.userOutput;
}