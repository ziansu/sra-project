public static final void VarIdentifierType() throws wci.frontend.ParseException {
    wci.frontend.TypeScriptParser.trace_call("VarIdentifierType");
    try {
        wci.frontend.TypeScriptParser.jj_consume_token(wci.frontend.VAR);
        wci.frontend.TypeScriptParser.IdentifierType();
    } finally {
        wci.frontend.TypeScriptParser.trace_return("VarIdentifierType");
    }
}