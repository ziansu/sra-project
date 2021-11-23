@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    final int lastSelectedPosition = org.droidplanner.android.activities.LocatorActivity.lastPositions.indexOf(selectedMsg);
    outState.putInt(org.droidplanner.android.activities.LocatorActivity.STATE_LAST_SELECTED_POSITION, lastSelectedPosition);
}