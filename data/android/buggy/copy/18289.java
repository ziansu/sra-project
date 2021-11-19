@java.lang.Override
public void preMove() {
    if ((java.lang.Math.random()) < 0.01) {
        if ((java.lang.Math.random()) <= 0.5) {
            vy = com.github.fishio.LevelBuilder.randomSpeed();
        }else {
            vx = com.github.fishio.LevelBuilder.randomSpeed();
        }
    }
}