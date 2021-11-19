private java.lang.String getKeyword() {
    switch (declarationType) {
        case CONSTANT_DEC :
            return com.sleekbyte.tailor.listeners.DeclarationListener.LET;
        case VARIABLE_DEC :
            return com.sleekbyte.tailor.listeners.DeclarationListener.VAR;
    }
    return "";
}