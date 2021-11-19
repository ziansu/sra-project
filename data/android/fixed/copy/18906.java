@java.lang.Override
public void stateChanged(de.yadrone.base.navdata.DroneState state) {
    if (state.isEmergency()) {
        this.isEmergency = true;
    }
}