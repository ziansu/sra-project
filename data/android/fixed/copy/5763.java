public static int randomBoundedInteger(int min, int max) {
    int length = (max - min) + 1;
    return (org.apache.flink.streaming.examples.sampling.helpers.SamplingUtils.rand.nextInt(length)) + min;
}