public net.sf.openrocket.rocketcomponent.FlightConfiguration getSelectedConfiguration() {
    checkState();
    if ((this.selectedConfiguration) == (this.configSet.getDefault())) {
        selectedConfiguration = createFlightConfiguration(null);
    }
    return selectedConfiguration;
}