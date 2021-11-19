public boolean attackCanBeExecuted(java.lang.String attackName) {
    if ((attackName.equals("Stretch Vine")) && (gameModel.getFullBenchPositions(getEnemyPlayer().getColor()).isEmpty()))
        return false;
    
    return true;
}