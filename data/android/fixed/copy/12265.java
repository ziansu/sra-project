public main.brain.learner.genetic.Gene<E> getFittest() {
    return populationSelector.selectElite(genePool, 1).get(0);
}