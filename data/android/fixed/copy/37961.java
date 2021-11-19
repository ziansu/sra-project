@java.lang.Override
public void onError(com.facebook.FacebookException error) {
    android.widget.Toast.makeText(this, "FaceBook Sign in Failed", Toast.LENGTH_SHORT).show();
    updateUI(null);
}