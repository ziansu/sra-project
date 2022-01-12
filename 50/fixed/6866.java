@java.lang.Override
public void stateChanged(org.eclipse.smarthome.core.items.Item item, org.eclipse.smarthome.core.types.State oldState, org.eclipse.smarthome.core.types.State newState) {
    oldGroupState = this.state;
    setState(function.calculate(members));
    sendGroupStateChangedEvent(item.getName(), this.state, oldGroupState);
}