public void getGrid() {
    for (; ;) {
        queryGrid();
        java.lang.System.out.println(userGrid);
        if (userGrid.isValid())
            break;
        
        java.lang.System.out.println("Invalid sudoku board. Try again.\n");
    }
}