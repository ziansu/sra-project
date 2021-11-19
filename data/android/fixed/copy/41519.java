public static void calculateFitness(double average) {
    for (Individual i : Driver.oldPopulation) {
        i.setReproductionChance((((double) (i.getEvaluation())) / average));
    }
}