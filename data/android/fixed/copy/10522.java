@java.lang.Override
public void kill() {
    health_ = 0;
    alive_ = false;
    GameScreen.worldController_.updateScore(points_on_death_);
    GameScreen.worldController_.world_.decreaseTargetCount();
}