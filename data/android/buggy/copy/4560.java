public int getNumOfNotCoveredGoals(org.evosuite.ga.FitnessFunction<?> ff) {
    return numsNotCoveredGoals.containsKey(ff) ? numsCoveredGoals.get(ff) : 0;
}