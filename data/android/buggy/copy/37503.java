public void addPenalty(float penalty, int reason) {
    this.penalty += penalty;
    (xf.xfvrp.base.Quality.reasons[reason])++;
}