@java.lang.Override
public void refreshData() {
    com.jwang.android.gymmate.task.media_task.RequestMediaByLocationId requestMediaByLocationId = new com.jwang.android.gymmate.task.media_task.RequestMediaByLocationId(getActivity());
    requestMediaByLocationId.execute(mLocationId);
}