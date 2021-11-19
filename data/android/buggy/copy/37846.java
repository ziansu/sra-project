@java.lang.Override
public com.github.fishio.achievements.State getState() {
    com.github.fishio.achievements.State state = new com.github.fishio.achievements.State();
    state.add("EnemyKill", isDead()).add("score", score.get()).add("Lives", getLives());
    return state;
}