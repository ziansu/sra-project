private double roundTwoDecimals(double d) {
    synchronized(twoDForm) {
        return java.lang.Double.valueOf(twoDForm.format(d));
    }
}