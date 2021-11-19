public void run() {
    try {
        new com.eclipsesource.json.JsonParser(new java.io.StringReader("")).parse();
    } catch (java.io.IOException exception) {
        throw new java.lang.RuntimeException(exception);
    }
}