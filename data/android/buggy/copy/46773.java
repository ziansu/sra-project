public boolean hasCachedResultString() {
    if ((specialCachedValue) == null) {
        return false;
    }
    return (specialCachedValue.getTypeCode()) == (org.apache.poi.hssf.record.FormulaRecord.SpecialCachedValue.STRING);
}