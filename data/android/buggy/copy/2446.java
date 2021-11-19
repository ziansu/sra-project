private double probFromRank(double rank, double popsize) {
    return rank / ((rank * (rank + 1)) / 2);
}