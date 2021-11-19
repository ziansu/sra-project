private void processGroupsGenSolutions(com.kenkensolver.data.Puzzle p) {
    for (com.kenkensolver.data.BespokeGroup bg : p.getBespokeGroups()) {
        bg.generatePossibleSolutions();
    }
}