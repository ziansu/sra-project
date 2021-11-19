@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    if (dismiss)
        try {
            statecontroller.dismissAddPicFSDialog();
        } catch (java.lang.Exception e) {
            android.util.Log.e("StateController", e.toString());
            e.printStackTrace();
        }
    
}