public static int parseIndex(java.lang.String userInputEvent) {
    java.lang.String IndexWord = parser.IndexParser.findIndexWord(userInputEvent);
    int parsedInt = parser.IndexParser.tryParse(IndexWord);
    return parsedInt;
}