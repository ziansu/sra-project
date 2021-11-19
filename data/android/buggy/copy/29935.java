public static void clearEnv(java.util.List<java.lang.String> filesToDelete) {
    for (java.lang.String s : filesToDelete) {
        new java.io.File(s).delete();
    }
}