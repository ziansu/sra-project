@java.lang.Override
public void success(java.lang.Object o, retrofit.client.Response response) {
    android.widget.Toast.makeText(mContext, "Post uploaded!", Toast.LENGTH_SHORT).show();
    android.util.Log.d("Chooser", "Post uploaded!");
}