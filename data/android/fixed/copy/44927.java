public static boolean isWorld(java.io.File file) {
    return new java.io.File(file, "level.dat").exists();
}