@java.lang.Override
public void onCarrierNameNotMatch(int smsId, java.lang.String message) {
    android.widget.Toast.makeText(this, ("onCarrierNameNotMatch: " + message), Toast.LENGTH_SHORT).show();
}