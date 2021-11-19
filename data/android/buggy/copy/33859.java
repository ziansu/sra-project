public java.lang.String getSearchStr() {
    dateParser.InputParser parser = new dateParser.InputParser(fullInput);
    java.lang.System.out.println(parser.getSearchString());
    return parser.getSearchString();
}