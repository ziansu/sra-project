@java.lang.Override
public void onFailure(retrofit2.Call<org.septa.android.app.services.apiinterfaces.model.NextArrivalDetails> call, java.lang.Throwable t) {
    android.util.Log.d(org.septa.android.app.nextarrive.NextToArriveResultsActivity.TAG, t.getMessage());
    android.util.Log.d(org.septa.android.app.nextarrive.NextToArriveResultsActivity.TAG, t.getStackTrace().toString());
}