@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.widget.Toast.makeText(this, ("error" + filePath), Toast.LENGTH_LONG).show();
}