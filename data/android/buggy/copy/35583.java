public static void deleteAll() {
    app.excuseme.util.CacheManager.deleteFile(app.excuseme.util.CacheManager.tmpFileDir.toFile());
}