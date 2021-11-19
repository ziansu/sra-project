public static boolean isJSONObject(java.lang.String string) {
    try {
        new com.fasterxml.jackson.databind.ObjectMapper().readTree(string);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}