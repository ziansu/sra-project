@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    android.util.Log.d(erica.beakon.Pages.RecommendedMovementsTab.TAG, databaseError.getMessage());
}