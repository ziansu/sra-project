@java.lang.Override
protected void onStop() {
    super.onStop();
    com.chartboost.sdk.Chartboost.onStop(cordova.getActivity());
}