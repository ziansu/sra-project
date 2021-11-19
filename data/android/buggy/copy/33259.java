public double getAverageCapacityViolation(java.util.ArrayList<hgsadc.Individual> population) {
    double sumCapacityViolation = 0.0;
    for (hgsadc.Individual individual : population) {
        sumCapacityViolation += individual.getPhenotype().getCapacityViolation();
    }
    return sumCapacityViolation / (population.size());
}