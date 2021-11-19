public int getRankOfRunner(java.lang.String runner) throws java.lang.Exception {
    int rank = lookUpEntry(runner);
    if (rank == (-1)) {
        throw new java.lang.Exception("Invalid runner. No such runner in ScoreBoard.");
    }
    return rank;
}