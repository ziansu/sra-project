public void addPenalty(float penalty, int reason) {
    this.penalty += penalty;
    if (penalty != 0)
        (xf.xfvrp.base.Quality.reasons[reason])++;
    
}