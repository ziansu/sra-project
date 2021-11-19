public boolean isValid() {
    if ((this.key.intern()) == (net.sf.openrocket.rocketcomponent.FlightConfigurationID.ERROR_CONFIGURATION_KEYTEXT)) {
        return false;
    }
    return true;
}