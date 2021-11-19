protected java.lang.Number getAttrNumber(java.lang.String name, java.lang.String attrName) {
    org.eclipse.dawnsci.analysis.dataset.impl.Dataset d = getCachedAttribute(name, attrName);
    if (d.hasFloatingPointElements()) {
        return d.getElementDoubleAbs(0);
    }
    return d.getElementLongAbs(0);
}