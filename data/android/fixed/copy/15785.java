public geometry.Dimension.Mutable set(float w, float h, boolean allowNegatives) {
    width = (allowNegatives) ? w : java.lang.Math.abs(w);
    height = (allowNegatives) ? h : java.lang.Math.abs(h);
    allowNegativeVals = allowNegatives;
    return this;
}