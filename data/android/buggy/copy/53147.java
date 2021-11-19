protected void writeFile(java.nio.file.Path path, com.google.gson.JsonElement json) throws java.io.IOException {
    JsonUtils.prettyGson.toJson(json, java.nio.file.Files.newBufferedWriter(path));
}