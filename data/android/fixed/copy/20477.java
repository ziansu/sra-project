@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    this.txtTour.setText((((this.tour) + 1) + ""));
    this.repaint();
}