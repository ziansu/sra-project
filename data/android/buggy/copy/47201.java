@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
    android.widget.Toast.makeText(com.rohan.callnote.BaseCallNoteActivity.instance, ("Connection Failed " + (connectionResult.getErrorMessage())), Toast.LENGTH_SHORT).show();
}