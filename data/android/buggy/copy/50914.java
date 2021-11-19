public static java.lang.String removeLineBreaks(java.lang.String userInput) {
    return userInput.replaceAll(Constant.REGEX_LINE_BREAK, "");
}