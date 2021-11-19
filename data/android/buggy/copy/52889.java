private void goToDragonsCave() {
    msg("has gone to the dragon's cave ");
    try {
        java.lang.Thread.sleep(100000);
    } catch (java.lang.InterruptedException e) {
        giveTreasure(this);
    }
}