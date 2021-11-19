private void changeState(@de.wackernagel.android.sidekick.widgets.CircularRevealView.State
int newState) {
    if ((state) == newState) {
        return ;
    }
    state = newState;
    if ((stateChangeListener) != null) {
        stateChangeListener.onStateChange(newState);
    }
}