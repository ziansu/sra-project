@java.lang.Override
public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.dhchoi.crowdsourcingapp.activities.TaskCompleteActivity.class);
    intent.putExtra(Task.TASK_KEY_SERIALIZABLE, mMarkerToTask.get(marker).getId());
    startActivity(intent);
}