private boolean jj_3R_9() {
    if (jj_scan_token(org.sbml.jsbml.text.parser.LEFT_BRACKET)) {
        return true;
    }
    if (jj_3R_10()) {
        return true;
    }
    if (jj_scan_token(org.sbml.jsbml.text.parser.RIGHT_BRACKET)) {
        return true;
    }
    return false;
}