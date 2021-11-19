public java.util.Map<java.util.Date, java.lang.Boolean> getStatistic() {
    if ((statistic) == null) {
        statistic = new java.util.TreeMap<>();
    }
    return new java.util.TreeMap<>(statistic);
}