private void genJavaDepend(java.io.PrintStream p) {
    for (java.lang.String d : mDepends) {
        p.printf("import %s;\r\n", d);
    }
    p.printf("\r\n");
}