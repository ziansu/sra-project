public static void main(java.lang.String[] args) {
    ru.kirpech.Population population = new ru.kirpech.Population(200, "/Users/user/IdeaProjects/shiftsPutting/src/ru/kirpech/input.txt");
    population.createPopulation();
    population.setNumberOfIterations(100);
    population.startGA();
}