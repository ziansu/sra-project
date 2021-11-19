public void setHeur(Heuristic heur, double weight) {
    this.heur = new WeightedHeuristic(heur, 1);
}