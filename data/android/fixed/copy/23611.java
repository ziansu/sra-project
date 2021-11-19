private void refreshWindowContent() {
    getContentPane().removeAll();
    initMenuePanel();
    initContentPanel();
    getContentPane().revalidate();
    getContentPane().repaint();
    setVisible(true);
}