public void add(double value) {
    (count)++;
    sum += value;
    range.add(value);
    if (hasBuckets()) {
        putIntoBucket(value);
    }
}