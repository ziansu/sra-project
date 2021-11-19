public org.renjin.sexp.SEXP findVariableOrThrow(java.lang.String name) {
    return findVariableOrThrow(org.renjin.sexp.Symbol.get(name));
}