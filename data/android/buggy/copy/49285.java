@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception exception) {
    android.widget.Toast.makeText(this, (url + " does not exist"), Toast.LENGTH_SHORT).show();
}