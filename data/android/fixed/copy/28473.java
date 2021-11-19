protected boolean isBest(model.Individual ind) {
    if (((best) == null) || ((ind.fitness) < (best.fitness))) {
        best = ind;
        return true;
    }
    return false;
}