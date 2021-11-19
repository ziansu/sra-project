private void addArgToList(java.lang.String arg, boolean isLast) {
    java.lang.System.out.println(("adding " + arg));
    if (!isLast) {
        argList += arg + "; ";
    }else {
        argList += arg;
    }
}