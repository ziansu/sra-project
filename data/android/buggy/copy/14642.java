public void checkPlayerArmySize(int playerIndex, int armySize) {
    if ((this.currentLargestArmySize) < armySize) {
        this.currentLargestArmyPlayer = armySize;
        this.setPlayerToHaveLargestArmy(playerIndex);
    }
}