public void update() {
    cardsOnTable = game.getTable().getCardsOnTable();
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        public void run() {
            reloadImages();
            frame.repaint();
        }
    });
}