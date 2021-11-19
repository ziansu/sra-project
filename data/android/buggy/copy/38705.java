public java.math.BigDecimal convertYardToSquareMeters(final java.lang.Float vacantLandArea) {
    java.lang.Float areaInSqMts = null;
    areaInSqMts = (new java.lang.Float(vacantLandArea)) * (new java.lang.Float(org.egov.ptis.constants.PropertyTaxConstants.SQUARE_YARD_TO_SQUARE_METER_VALUE));
    return new java.math.BigDecimal(areaInSqMts).setScale(2, java.math.BigDecimal.ROUND_HALF_UP);
}