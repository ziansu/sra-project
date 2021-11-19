private void stepButtonActionPerformed(java.awt.event.ActionEvent evt) {
    solveIfNull();
    maze.step();
    mazePane.setText(maze.toString());
}