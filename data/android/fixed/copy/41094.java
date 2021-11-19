private java.lang.String addSign(double d) {
    if (d >= 0) {
        return "+" + d;
    }else {
        return java.lang.String.valueOf(d);
    }
}