public void start() {
    super.start();
    com.pulsefield.tracker.Laser.getInstance().setFlag("legs", 0.0F);
    setupLifeGrid();
}