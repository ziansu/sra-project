public static java.lang.String getJson(com.mediamath.terminalone.models.VideoCreative entity) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String response = gson.toJson(entity);
    return response;
}