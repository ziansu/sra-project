boolean checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType that, com.google.javascript.rhino.jstype.EquivalenceMethod eqMethod, com.google.javascript.rhino.jstype.EqCache eqCache) {
    if (!(returnType.checkEquivalenceHelper(that.returnType, eqMethod, eqCache))) {
        return false;
    }
    return hasEqualParameters(that, eqMethod, eqCache);
}