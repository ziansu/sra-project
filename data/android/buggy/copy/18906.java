@java.lang.Override
public void stateChanged(de.yadrone.base.navdata.DroneState state) {
    this.isEmergency = state.isEmergency();
}