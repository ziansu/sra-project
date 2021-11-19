private static boolean doesFilerExist(java.io.File file) {
    if (file == null)
        return false;
    
    return file.exists();
}