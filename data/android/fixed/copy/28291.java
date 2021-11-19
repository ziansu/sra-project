public static boolean equals(java.io.File file1, java.io.File file2) {
    if ((file1 == null) || (file2 == null))
        return false;
    
    return file1.getAbsoluteFile().equals(file2.getAbsoluteFile());
}