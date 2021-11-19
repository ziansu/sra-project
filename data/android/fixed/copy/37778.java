public void refresh(javax.swing.JPanel panel) {
    this.setVisible(false);
    this.dispose();
    GUI.MainFrame main = new GUI.MainFrame(this.user, panel);
    main.setVisible(true);
}