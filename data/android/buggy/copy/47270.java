@java.lang.Override
public void failure(com.appdest.hcue.services.RestError restError) {
    hideLoader();
    android.widget.Toast.makeText(this, restError.getErrorMessage(), Toast.LENGTH_LONG).show();
}