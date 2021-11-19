public boolean runComplete(final ec.steadystate.EvolutionState state, final ec.steadystate.Individual ind) {
    if (ind.fitness.isIdealFitness())
        return true;
    
    return false;
}