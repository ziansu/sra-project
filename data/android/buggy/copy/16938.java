public java.lang.Integer getPromoterEnd(int upstream, int downstream) {
    if (strand.equals("+")) {
        return start;
    }else {
        return (end) + downstream;
    }
}