public org.batfish.smt.TransferFunctionResult addChangedVariables(org.batfish.smt.TransferFunctionResult other) {
    org.batfish.smt.TransferFunctionResult ret = new org.batfish.smt.TransferFunctionResult(this);
    ret._changedVariables.plusAll(other._changedVariables);
    return ret;
}