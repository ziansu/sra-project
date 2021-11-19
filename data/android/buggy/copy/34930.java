@java.lang.Override
public <T extends java.lang.Number> double[] predict(java.util.Collection<T> values, int numPredictions) {
    return next(values, (numPredictions + 1));
}