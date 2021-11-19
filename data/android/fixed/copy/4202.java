public void set(float value) {
    if ((java.lang.Math.abs(((last) - value))) > delta) {
        last = value;
        out.produce();
    }
}