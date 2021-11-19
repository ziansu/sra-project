private double nextDouble() {
    state = (2862933555777941757L * (state)) + 1;
    return ((double) (((int) ((state) >>> 33)) + 1)) / 2.147483648E9;
}