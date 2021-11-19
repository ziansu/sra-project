public void setTimestamps(java.lang.String[] values) {
    timestamps = values;
    countOfLines = values.length;
    invalidate();
    requestLayout();
}