@java.lang.Override
public void onSuccess() {
    if ((mApp.getRepo()) != null)
        goToMain();
    else
        android.widget.Toast.makeText(this, "The selected repo does not exist", Toast.LENGTH_SHORT).show();
    
}