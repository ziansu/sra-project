@java.lang.Override
public void doTransitionAction() {
    detachListeners(fromBehaviorState.getBehavior());
    attachListeners(toBehaviorState.getBehavior());
}