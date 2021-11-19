@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplication(), heartware.com.heartware_master.ViewWorkout.class);
    intent.putExtra(DBAdapter.PROFILE_ID, mCurrentProfileId);
    startActivityForResult(intent, heartware.com.heartware_master.RESULT_OK);
    android.util.Log.d(heartware.com.heartware_master.WorkoutsActivity.TAG, "Creating a New Workout.");
}