public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("A pressed");
    tetris.GameRunner.tetrisSystem.moveActiveTetromino(0, 0, (-1));
}