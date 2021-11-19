public boolean canAffordRed(uk.org.ulcompsoc.ld32.components.Tower tow) {
    return wallet.checkBalance(((uk.org.ulcompsoc.ld32.systems.TowerSystem.RED_UPGRADE_COST) * (tow.red.getStage())), 0, 0);
}