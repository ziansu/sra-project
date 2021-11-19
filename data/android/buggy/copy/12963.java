@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putSerializable("disturbances", disturbances);
    outState.putLong("updated", lastUpdate.getMillis());
}