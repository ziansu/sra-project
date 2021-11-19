public void getSolution() {
    init();
    min_cost();
    while (solver.solve()) {
        printSolution();
    } 
}