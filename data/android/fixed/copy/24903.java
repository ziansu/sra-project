@java.lang.Override
public void run() {
    if (myApp.wasInBackground) {
        com.google.firebase.crash.FirebaseCrash.log("MainActivity inBackground ONSTOP");
        if (au.com.cynjames.utils.GenericMethods.isConnectedToInternet(context)) {
            uploadDatatoServer();
        }
    }
}