private void checkBoost() {
    if (towerBoost.isFinished()) {
        revertTowers();
        active = false;
        java.lang.System.out.println("Reverting");
    }
}