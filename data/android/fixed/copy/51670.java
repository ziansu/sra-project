public static void writeEnd(java.io.File file, java.lang.String stAdd) {
    java.lang.String buffer;
    buffer = "E" + (stAdd.toUpperCase());
    pass1_1.Utility.writeLine(buffer, file);
}