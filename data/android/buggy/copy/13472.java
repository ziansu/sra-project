public void update() {
    cardsOnTable = game.getTable().getCardsOnTable();
    reloadImages();
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        public void run() {
            frame.repaint();
        }
    });
}