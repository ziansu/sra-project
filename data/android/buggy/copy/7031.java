private boolean operatorCondition(org.moflon.tgg.mosl.tgg.NamePattern namePattern) {
    return ((namePattern != null) && ((namePattern.getOp()) != null)) && (getOperatorCondition(namePattern.getOp()));
}