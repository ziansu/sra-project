public void createView() {
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    setTitle("Minesweeper");
    setContentPane(mainPanel);
    setResizable(false);
    initActionBar();
    initGameContent();
    pack();
    setVisible(true);
}