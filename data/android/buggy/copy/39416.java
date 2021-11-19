private java.lang.String printTempSplitContains(java.lang.String message, java.lang.String[] tempSplit) {
    java.lang.System.out.print(message);
    for (java.lang.String s : tempSplit) {
        java.lang.System.out.print((" - " + s));
    }
    java.lang.System.out.println();
    return null;
}