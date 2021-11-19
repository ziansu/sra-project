public void setButtonPhase0() {
    buttonpanel.removeAll();
    javax.swing.JLabel deb = new javax.swing.JLabel("Veuillez attendre le debut d'une autre partie.");
    buttonpanel.add(deb);
    plateau.removeAll();
    this.revalidate();
    this.repaint();
}