private void prepareStartProfile(int requestCode) throws android.os.RemoteException {
    android.content.Intent requestpermission = mService.prepareVPNService();
    if (requestpermission == null) {
        onActivityResult(requestCode, Activity.RESULT_OK, null);
    }else {
        onActivityResult(requestCode, Activity.RESULT_OK, null);
    }
}