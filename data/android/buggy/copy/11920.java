public int getRemainingKeys() {
    if ((seqNum) <= (seqMax)) {
        return (seqNum) - (seqMax);
    }else {
        return ((totalKeys) - (seqNum)) + (seqMax);
    }
}