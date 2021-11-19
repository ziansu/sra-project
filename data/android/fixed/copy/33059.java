private double normalizedMaxGap() {
    return (absoluteMaxAllowedGapValue) == null ? 1.0 : (absoluteMaxAllowedGapValue.doubleValue()) / ((absoluteMaxValuePrim) - (absoluteMinValuePrim));
}