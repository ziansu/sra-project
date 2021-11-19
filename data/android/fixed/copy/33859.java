public java.lang.String getSearchStr() {
    dateParser.InputParser parser = new dateParser.InputParser(fullInput);
    return parser.getSearchString();
}