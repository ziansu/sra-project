void defineLabels() {
    if (handleValues) {
        labelsValues = calcLabels();
        labels = getLabelsFromValues();
    }else {
        labels = getLabelsFromData();
    }
    nLabels = labels.size();
}