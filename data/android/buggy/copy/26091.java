@java.lang.Override
public void onClick(android.view.View v) {
    uk.ac.ncl.csc2022.t14.bankingapp.Utilities.DataStore.sharedInstance().getConnector().logout(this);
    android.util.Log.d("TEST", "logout button: ON CLICK");
}