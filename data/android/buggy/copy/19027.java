protected boolean isValid(int step) {
    return ((step >= 0) && (step <= ((repeatCnt) << 1))) || ((repeatCnt) < 0);
}