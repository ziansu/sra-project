public static java.lang.String nBBSDI(java.lang.String bbsdi) {
    java.lang.String out;
    if (bbsdi != null) {
        out = bbsdi.replaceFirst("BBSDI:", "");
    }else {
        out = "";
    }
    return out;
}