public int getSolutionCount() {
    solutionCount = 0;
    clear();
    solveH(0, true);
    return solutionCount;
}