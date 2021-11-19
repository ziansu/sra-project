private java.lang.String removeDateFromInputLine(java.lang.String inputLine, parser.DateGroup group) {
    if (inputLine.contains(group.getText())) {
        inputLine = inputLine.replace(group.getText(), "");
    }
    return inputLine;
}