@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle bundle) {
    currentState = bundle.getParcelable("state");
    onActivityModeChanged();
    locationHandler.onRestoreInstanceState(bundle);
    super.onRestoreInstanceState(bundle);
}