public boolean ackNumMakesSense(int acknum) {
    if ((acknum < (base)) || (acknum > (nextSeqNum))) {
        return false;
    }else {
        return true;
    }
}