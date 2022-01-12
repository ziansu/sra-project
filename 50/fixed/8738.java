public int incrementAndProgress() {
    return (maxValue) == 0 ? 0 : java.lang.Math.round(java.lang.Math.min((((inc()) * 100) / (maxValue)), 100));
}