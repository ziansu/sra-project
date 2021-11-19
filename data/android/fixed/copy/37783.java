private void findBestFitness() {
    chromosomes = new java.util.ArrayList(chromosomes);
    chromosomes.sort(new evolver.Population.ChromosomeFitnessComparator());
    bestIndividuals = chromosomes;
}