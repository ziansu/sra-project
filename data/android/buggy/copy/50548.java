public final double nextDouble(final double min, final double max) {
    final double range = max - min;
    return (range * (ml.shifu.shifu.core.dtrain.LogisticRegressionMaster.RANDOM.nextDouble())) + min;
}