@java.lang.Override
public void doTransitionAction() {
    detachListeners(fromBehaviorState.getBehavior());
    attachListeners(toBehaviorState.getBehavior());
    hasBeenInitialized.set(false);
}