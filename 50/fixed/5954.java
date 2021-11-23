private boolean executeSW_BREAK() {
    if (!(checkEOL()))
        return false;
    
    if ((mSwitch) != null) {
        ExecutingLineIndex = mSwitch.mEnd;
    }
    return true;
}