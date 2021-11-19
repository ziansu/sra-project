public java.lang.String setKanaJp(java.lang.String arrUserDivJp, java.lang.String ntvName) {
    if (("2".equals(arrUserDivJp)) || ("1".equals(arrUserDivJp))) {
        return ntvName;
    }else {
        return jp.co.misumi.batch.FVQ_ItemProcessor.BLANK;
    }
}