private void printCategory(java.util.ArrayList<java.lang.String> category, java.io.PrintStream writer) {
    for (java.lang.String obj : category) {
        writer.println(obj);
    }
    writer.println("*");
}