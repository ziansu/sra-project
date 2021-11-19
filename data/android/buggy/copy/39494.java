@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(mobileoak.volleyballtracker.adapter.RosterAdapter.TAG, ("Got a click on " + (player.getName())));
    if ((mListener) != null) {
        mListener.rowSelected(player);
    }
}