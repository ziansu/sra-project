@java.lang.Override
public void onError(java.lang.Exception error) {
    hideLoginProgress();
    java.lang.String errorMessage = (error == null) ? error.getMessage() : "Error";
    android.widget.Toast.makeText(activity, errorMessage, Toast.LENGTH_LONG).show();
}