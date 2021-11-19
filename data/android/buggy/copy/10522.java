@java.lang.Override
public void kill() {
    health_ = 0;
    alive_ = false;
    java.lang.System.out.println("Target is dead");
    GameScreen.worldController_.updateScore(points_on_death_);
    GameScreen.worldController_.world_.decreaseTargetCount();
}