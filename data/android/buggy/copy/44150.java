public static void salvarMissa(java.lang.String missaFreeForm) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException {
    java.io.PrintWriter writer = new java.io.PrintWriter("db/missa-freeform.txt", "UTF-8");
    writer.println(missaFreeForm);
    writer.close();
}