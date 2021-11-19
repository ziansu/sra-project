@java.lang.Override
public int onCollisionHighScoreIncrement() {
    return ((int) (java.lang.Math.max(((element.getSize()) + (element.getSpeed())), 0)));
}