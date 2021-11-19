private static void plainRead() {
    java.lang.String line;
    do
        line = fileio.FileParser.readLine();
    while (!(line.equals(fileio.SECTION_SEPARATOR)) );
}