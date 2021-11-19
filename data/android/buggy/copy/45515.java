public java.lang.String getRejectionLetterSerialNum() {
    java.lang.String type = org.egov.ptis.constants.PropertyTaxConstants.REJECTION_SEQ_STR;
    return sequenceNumberGenerator.getNextNumber(type, 1).getFormattedNumber();
}