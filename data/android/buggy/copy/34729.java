private boolean jj_3R_146() {
    if (jj_scan_token(japa.parser.IDENTIFIER))
        return true;
    
    japa.parser.Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_183())
        jj_scanpos = xsp;
    
    return false;
}