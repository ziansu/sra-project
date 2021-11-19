public void shift(double value) {
    for (org.sd.util.range.AbstractNumericRange.SimpleRange range : ranges) {
        range.shift(value);
    }
}