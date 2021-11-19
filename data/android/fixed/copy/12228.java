public void analyzeMergeCommits() {
    java.util.HashMap<java.lang.String, statistics.MergeCommit> mc = this.loadMC();
    this.filterConflictingMC(mc);
    this.getNumberOfDevs();
}