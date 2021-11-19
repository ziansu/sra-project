public void put(double value) {
    (count)++;
    sum += value;
    range.put(value);
    if (hasBuckets()) {
        putIntoBucket(value);
    }
}