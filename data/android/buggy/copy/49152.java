public boolean ackIsDuplicate(int acknum) {
    if ((acknum == (dupACKNum)) && ((dupACKCount) > 0)) {
        return true;
    }else {
        return false;
    }
}