void enemyDeath() {
    if ((enemies.size()) <= (enemyCurrent)) {
        enemyCurrent += 1;
        releaseEnemy();
    }else {
        progressManager.setDungeonNumber();
        toMain();
    }
}