@java.lang.Override
public void onCancel() {
    android.widget.Toast.makeText(this, "FaceBook Sign in cancelled", Toast.LENGTH_SHORT).show();
    updateUI(null);
}