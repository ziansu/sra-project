@java.lang.Override
public void onTokenRefresh() {
    java.lang.String refreshedToken = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    android.util.Log.d(andre.com.datapushandroid.services.FCM_InstanceIdService.TAG, ("Refreshed token: " + refreshedToken));
    sendRegistrationToServer(refreshedToken);
}