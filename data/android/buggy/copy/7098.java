private double gain(Assignment5.TrainingSet trainingSet, Assignment5.Attribute attribute) {
    assert attribute.isDiscrete();
    double gain = (info(trainingSet)) - (info(trainingSet, attribute));
    return gain;
}