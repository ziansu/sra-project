public void preprocess(java.nio.file.Path target) throws java.io.IOException, parse.ParseException {
    ensureFileExistency(target);
    try (java.io.BufferedWriter w = java.nio.file.Files.newBufferedWriter(target, java.nio.charset.StandardCharsets.UTF_8)) {
        preprocess(w);
    }
}