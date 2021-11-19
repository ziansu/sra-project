@java.lang.Override
public void stop() {
    currentState.deactivate();
    this.isActive = false;
    currentState = null;
}