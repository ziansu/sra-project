public java.lang.Double sum() {
    if (acc.isEmpty()) {
        return null;
    }
    java.lang.Double sum = 0.0;
    for (java.lang.Double n : acc.values()) {
        sum += n;
    }
    return sum;
}