private void muPlusLambdaSelection() {
    int mu = size;
    int lambda = offspringSize;
    population.addAll(offspring);
    sortPopulation();
    population.subList(mu, (mu + (lamda))).clear();
}