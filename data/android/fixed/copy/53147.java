protected void writeFile(java.nio.file.Path path, com.google.gson.JsonElement json) throws java.io.IOException {
    try (java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(path)) {
        JsonUtils.prettyGson.toJson(json, writer);
    }
}