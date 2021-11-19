@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    com.nikogalla.tripbook.utils.StatusSnackBars.getErrorSnackBar(getString(R.string.database_error), clActivityAroundYouContainer, this).show();
}