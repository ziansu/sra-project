public static void print() {
    mazeSolver.MazeReader.checkEmpty();
    for (char[] charArray : mazeSolver.MazeReader.grid) {
        for (char c : charArray) {
            java.lang.System.out.print(c);
        }
        java.lang.System.out.println("");
    }
}