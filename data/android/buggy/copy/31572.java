static double getFitness(final SimpleGA.Individual individual) {
    double fitness = 0;
    final UWSN_ResurfacingGA.ResurfacingSimulation R = new UWSN_ResurfacingGA.ResurfacingSimulation();
    fitness = R.Run(SimpleGA.FitnessCalc.binaryToInteger(individual.getGeneString()));
    return fitness;
}