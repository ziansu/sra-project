public static final java.lang.String getQualifiedName(java.lang.String localName, java.lang.String pfx) {
    return (pfx.length()) == 0 ? localName : (pfx + (com.siemens.ct.exi.Constants.COLON)) + localName;
}