private static java.io.File checkAndMkdirs(java.io.File file) {
    if (!(file.exists())) {
        file.mkdirs();
    }
    return file;
}