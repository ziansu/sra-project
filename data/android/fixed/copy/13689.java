public int getMissilesLeft(int playerID) {
    assert playerID < 2;
    assert playerID >= 0;
    return (battle.SimpleBattle.nMissiles) - (stats.get(playerID).nMissiles);
}