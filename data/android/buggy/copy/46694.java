public java.lang.String convertRefNo(java.lang.String refNo) {
    if ((refNo.indexOf("-")) >= 0) {
        refNo = refNo.replaceAll("-", "");
    }
    return refNo;
}