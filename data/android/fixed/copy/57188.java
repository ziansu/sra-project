private synchronized void addModsetString(java.lang.String rt) {
    if ((rt.length()) < 5) {
    }else {
        (modsetCounter)++;
        modString.add(rt);
    }
}