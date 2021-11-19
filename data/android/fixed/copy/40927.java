public static void refreshAllFlightParameters() {
    if ((org.airmind.ble.ParameterManager.controller) != null) {
        org.airmind.ble.ParameterManager.refreshAllParameters();
    }else {
    }
}