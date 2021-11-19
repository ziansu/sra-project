public void shengchengtu() {
    if ((mps.status) == 0) {
        mps.randomcreate();
        mps.status = 1;
        repaint();
    }
}