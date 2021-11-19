private void init() {
    timeExpansionGraph = new solvers.sat.TimeExpansionGraph(problemInstance.getGraph().getNodes(), 0);
}