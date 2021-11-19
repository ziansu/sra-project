public void setRange(final java.lang.Double min, final java.lang.Double max, final java.lang.Double tickSize) {
    setMin(min);
    setMax(max);
    if (tickSize != null) {
        setTickSize(tickSize.toString());
    }
}