int hashCode(double amount) {
    return java.util.Objects.hash(((java.lang.Math.round((((amount - (offset)) * (baseUnitRatio)) * 1.0E7))) / 1.0E7));
}