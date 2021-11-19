private void updateBoss(float deltaTime) {
    boss.update(deltaTime, this);
    if ((boss.state) == (Boss.BOSS_IS_DEAD))
        score += 100;
    
}