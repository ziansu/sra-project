private org.teavm.model.util.Variable copyVar(org.teavm.model.util.VariableReader var) {
    if (var == null) {
        throw new java.lang.NullPointerException();
    }
    return programCopy.variableAt(var.getIndex());
}