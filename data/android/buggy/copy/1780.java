@java.lang.Override
public void run() {
    gomoku.Action a = agent.getAction(state);
    ref[a.y()][a.x()].doClick();
}