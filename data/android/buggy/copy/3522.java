@java.lang.Override
public void switchOff() {
    if (this.isSwitchedOff()) {
        this.switchState = SwitchState.OFF;
        this.fireSwitchStateChangedEvent(new java.beans.PropertyChangeEvent(this, this.switchState.name(), this, this));
    }
}