private void clearSelect() {
    villageUpgradeChoice = null;
    unitActionChoice = null;
    unitUpgradeHireChoice = null;
    possibleActionsLock.lock();
    possibleActions = null;
    actionsReady = true;
    possibleActionsLock.unlock();
}