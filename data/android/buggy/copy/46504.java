public int getOutcome(java.lang.Long t) {
    return ((getActualOutcome(t)) >> (offset[targetVar])) == 1 ? 0 : 1;
}