public void createView() {
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    setTitle("Minesweeper");
    setContentPane(mainPanel);
    setResizable(true);
    initActionBar();
    initGameContent();
    pack();
    setVisible(true);
}