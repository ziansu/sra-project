public static java.lang.String convertToString(java.lang.Object obj) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    return gson.toJson(obj);
}