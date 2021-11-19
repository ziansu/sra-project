private void findBestFitness() {
    chromosomes.sort(new evolver.Population.ChromosomeFitnessComparator());
    bestIndividuals = chromosomes;
}