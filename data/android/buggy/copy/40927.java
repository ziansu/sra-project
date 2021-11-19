public static void refreshAllFlightParameters() {
    if ((org.airmind.ble.ParameterManager.controller) != null) {
        org.airmind.ble.ParameterManager.refreshAllParameters();
    }else {
        throw new java.lang.NullPointerException(("ParametersController is NULL in ParameterManager. " + "Must implement 'IParametersController' interface and call setController() before refreshing parameters."));
    }
}