public static java.lang.String nBBSDI(java.lang.String bbsdi) {
    if (bbsdi != null) {
        return bbsdi.replaceFirst("BBSDI:", "");
    }
    return null;
}