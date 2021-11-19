public double getAverageLatency() {
    double averageLatency = 0.0;
    for (SuccessQuery sq : successQueryList) {
        double tempLatency = sq.getLatency();
        averageLatency += tempLatency;
    }
    return averageLatency / (successQueryList.size());
}