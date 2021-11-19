public boolean initSession(io.branch.referral.Branch.BranchReferralInitListener callback, boolean isReferrable, @android.support.annotation.NonNull
android.net.Uri data, android.app.Activity activity) {
    boolean uriHandled = readAndStripParam(data, activity);
    initSession(callback, isReferrable, activity);
    return uriHandled;
}