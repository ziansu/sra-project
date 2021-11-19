@rpg.value.Immutable
private java.math.MathContext getContext() {
    return new java.math.MathContext(getUnit().getPrecision(), java.math.RoundingMode.HALF_EVEN);
}