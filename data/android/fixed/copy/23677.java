private void registerAll(java.nio.file.Path start) throws java.io.IOException {
    java.nio.file.Files.walk(start).forEach(( path) -> {
        try {
            register(path);
        } catch (java.lang.Exception e) {
        }
    });
}