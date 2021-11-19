private static com.thoughtworks.pos.domains.ShoppingChart ParseShoppingChartFromFile(java.lang.String arg) throws java.io.IOException {
    java.io.File file = new java.io.File(arg);
    com.thoughtworks.pos.services.services.InputParser inputParser = new com.thoughtworks.pos.services.services.InputParser(file);
    return inputParser.parser();
}