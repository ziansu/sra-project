public java.lang.String generateUnitIdentifierPrefix() {
    return sequenceNumberGenerator.getNextNumber(org.egov.ptis.constants.PropertyTaxConstants.UNIT_IDENTIFIER_SEQ_STR, 1).getFormattedNumber();
}