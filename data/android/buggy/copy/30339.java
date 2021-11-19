public boolean getBit(int i) {
    if (i < 4) {
        return lo.getBit(i);
    }else {
        return hi.getBit((-4));
    }
}