public java.math.BigDecimal getDuties() {
    int decimalPlaces = 2;
    java.math.BigDecimal bd = new java.math.BigDecimal(duties.doubleValue());
    bd = bd.setScale(decimalPlaces, java.math.BigDecimal.ROUND_HALF_UP);
    duties = bd;
    return duties;
}