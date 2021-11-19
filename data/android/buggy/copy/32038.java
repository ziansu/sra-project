public unitController.EnemyData getEnemyData(int level) {
    resetOutput();
    getEnemyStat(level);
    getEnemyImage(level);
    getEnemyStartPosition();
    return output;
}