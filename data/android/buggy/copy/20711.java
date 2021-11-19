@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    windowSizeBtn.setText(setGameWindowSize());
    menuPanel.setPreferredSize(new java.awt.Dimension(snake.Window.WINDOW_DIMENSION, snake.Window.WINDOW_DIMENSION));
    pack();
    setLocationRelativeTo(null);
}