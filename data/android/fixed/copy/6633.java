private void checkLocationServices(final org.apache.cordova.CallbackContext callbackContext) {
    if (com.hypertrack.lib.HyperTrack.checkLocationServices(this.cordova.getActivity().getApplicationContext())) {
        callbackContext.success("true");
    }else {
        callbackContext.success("false");
    }
}