public java.lang.String generateMemoNumber() {
    java.lang.String memoNumber = "";
    java.lang.String type = org.egov.ptis.constants.PropertyTaxConstants.MEMONO_SEQ_STR;
    return memoNumber + (org.egov.infstr.utils.StringUtils.leftPad(sequenceNumberGenerator.getNextNumber(type, 1).getFormattedNumber(), 5, "0"));
}