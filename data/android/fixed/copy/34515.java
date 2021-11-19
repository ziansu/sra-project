private java.lang.String buildScripts() {
    java.lang.StringBuilder str = new java.lang.StringBuilder();
    for (java.lang.String line : scripts) {
        str.append((line + "\n"));
    }
    return str.toString();
}