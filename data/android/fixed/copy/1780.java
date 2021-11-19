@java.lang.Override
public void run() {
    gomoku.Action a = agent.getAction(state);
    ref[a.x()][a.y()].doClick();
}