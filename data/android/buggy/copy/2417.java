public void level(java.lang.String levelN) throws java.io.FileNotFoundException {
    level = new java.io.File(levelN);
    reader = new java.util.Scanner(level);
    reader.useDelimiter("X");
}