public com.jantuomi.tunkki.core.parser.datatype.Datatype resolveSymbol(java.lang.String symbol) throws com.jantuomi.tunkki.exception.types.TunkkiError {
    return scopes.peek().resolveSymbol(symbol);
}