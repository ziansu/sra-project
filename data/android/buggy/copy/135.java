@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("PROCESS!!", "updateButton.setOnClickListener");
    com.onettm.directions.DirectionsApplication.getInstance().getLocationsManager().invalidate();
}