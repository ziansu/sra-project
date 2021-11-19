@java.lang.Override
public void onImageSelected(android.net.Uri uri) {
    imagePreview(uri);
    android.widget.Toast.makeText(this, "length ", Toast.LENGTH_SHORT).show();
}