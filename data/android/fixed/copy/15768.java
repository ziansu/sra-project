private void checkBoost() {
    if (towerBoost.isFinished()) {
        revertTowers();
        active = false;
    }
}