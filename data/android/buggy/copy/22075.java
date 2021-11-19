private java.lang.String findNextUnusedFileName(java.lang.String fileName) {
    int i = 1;
    java.lang.String usedName = fileName;
    while (writtenFileNames.contains(usedName))
        usedName = fileName + i;
    
    return usedName;
}