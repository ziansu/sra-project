private boolean isWrapChar(int type) {
    switch (type) {
        case antlr4.GlacierParser.COMMA :
            return true;
        default :
            return false;
    }
}