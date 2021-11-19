public void addDataPoint(jsat.linear.Vec v, int classification, double weight) {
    addDataPoint(v, jsat.classifiers.ClassificationDataSet.emptyInt, classification, 1.0);
}