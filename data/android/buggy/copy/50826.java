public void put(int value) {
    samples.add(new me.shreyasr.ancients.util.TimeBasedRollingAverage.Sample(java.lang.System.currentTimeMillis(), value));
}