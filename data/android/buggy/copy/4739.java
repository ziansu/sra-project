private void revertTowers() {
    for (towers.Tower t : towers) {
        towerBoost.unBoost(t);
        java.lang.System.out.println("UNBOOSTING TOWERS");
    }
}