public void refresh(javax.swing.JPanel panel) {
    GUI.MainFrame main = new GUI.MainFrame(this.user, panel);
    main.setVisible(true);
    this.dispose();
}