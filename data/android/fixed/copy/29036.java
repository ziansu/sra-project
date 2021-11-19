void enemyDeath() {
    enemyCurrent += 1;
    if ((enemyCurrent) < (enemies.length)) {
        releaseEnemy();
    }else {
        progressManager.setDungeonNumber();
        toMain();
    }
}