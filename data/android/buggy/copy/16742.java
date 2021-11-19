private java.lang.String blankLsidIfNecessary(java.lang.String lsid) {
    if ((lsid.length()) > 10) {
        return "";
    }else {
        return lsid;
    }
}