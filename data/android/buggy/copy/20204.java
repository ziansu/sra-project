private boolean jj_3R_28() {
    if (jj_scan_token(org.sbml.jsbml.text.parser.LEFT_BRACES)) {
        return true;
    }
    if (jj_scan_token(org.sbml.jsbml.text.parser.RIGHT_BRACES)) {
        return true;
    }
    return false;
}