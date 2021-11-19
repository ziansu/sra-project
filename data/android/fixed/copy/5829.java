private void CheckForSemicolon() {
    if (mIsBinaryFormat)
        return ;
    
    if (!(";".equals(GetNextToken())))
        ThrowException("Semicolon expected.");
    
}