private void DrawField(char[][] field) {
    for (char[] x : field) {
        for (char y : x) {
            java.lang.System.out.print((y + " "));
        }
        java.lang.System.out.println();
    }
}