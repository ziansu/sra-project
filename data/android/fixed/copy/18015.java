private java.math.BigDecimal calculateDelta() throws java.lang.Exception {
    this.delta = scale((this.isCallOption ? cummulativeNormalDensity(this.d1) : negate(cummulativeNormalDensity(negate(this.d1)))));
    return this.delta;
}