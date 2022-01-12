public void saveUserInput(java.lang.String input) {
    if (input.isEmpty()) {
        return ;
    }
    userInputHistory.addFirst(input.trim());
    resetIterator();
    logger.info(("Capturing user input: " + input));
}