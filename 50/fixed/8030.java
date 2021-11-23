public double getResponseTimeAverage() {
    final java.lang.Double value = pluginRequestRepo.getResponseTimeAvg();
    if (value != null) {
        return value;
    }
    return 0;
}