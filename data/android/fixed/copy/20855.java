public void solve() {
    while (!(solvedGrid.isSolved())) {
        if (!(solveIterative())) {
            java.lang.System.out.println("A little hard to solve?");
            return ;
        }
    } 
}