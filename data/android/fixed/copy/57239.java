public java.lang.String flattenList(java.util.List<java.lang.String> name) {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (java.lang.String string : name) {
        result.append(string);
        result.append(" ");
    }
    return result.toString();
}