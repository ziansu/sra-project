public void mutate(int currentGeneration, java.util.Map mutationMap) {
    getIndividualA().mutate(currentGeneration, mutationMap);
    getIndividualB().mutate(currentGeneration, mutationMap);
}