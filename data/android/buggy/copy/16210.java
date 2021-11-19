private static void buildTypes() {
    Keywords.types.put("INTEGER", new Token("[0-255]"));
    Keywords.types.put("STRING", new Token("\".([a-z]|\\s)*.\""));
    Keywords.types.put("BOOLVAL", new Token("true|false"));
}