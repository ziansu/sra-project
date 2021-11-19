@java.lang.Override
public double computeDerivative(int component, double[] features, double actualLabel, double predictedLabel) {
    return actualLabel - predictedLabel;
}