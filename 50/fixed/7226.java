public boolean isMoreTextNeeded() {
    if ((lexicalState) == (qcfcs_parsing.LexicalAnalyser.EnumLexicalState.lexicalStateStart))
        return false;
    
    return true;
}