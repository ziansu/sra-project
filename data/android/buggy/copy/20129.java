public static void main(java.lang.String[] args) {
    Maze m = new Maze("data3.dat");
    m.solveBFS(true);
    java.lang.System.out.println(m);
}