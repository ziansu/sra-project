public datamanagement.IUnit getUnit(java.lang.String unitCode) {
    datamanagement.IUnit unit = unitsByUnitCode_.get(unitCode);
    if (unit != null) {
        return unit;
    }
    return createUnit(unitCode);
}