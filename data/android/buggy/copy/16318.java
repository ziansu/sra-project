@java.lang.Override
public void run() {
    callback.onSuccess(new org.matrix.androidsdk.crypto.MXCrypto.DoKeyDownloadForUsersResponse(usersDevicesInfoMap, failedUserIds));
}