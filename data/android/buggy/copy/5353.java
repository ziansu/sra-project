public static boolean isComplete(int[][] grid) {
    if ((SudokuValidity.nextEmptyCase(grid)) == (-1)) {
        return true;
    }
    return false;
}