public void run() {
    try {
        new com.eclipsesource.json.JsonParser(new java.io.StringReader(input), 3).parse();
    } catch (java.io.IOException e) {
    }
}