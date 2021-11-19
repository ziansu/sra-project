public boolean initSession(io.branch.referral.Branch.BranchReferralInitListener callback, boolean isReferrable, @android.support.annotation.NonNull
android.net.Uri data, android.app.Activity activity) {
    readAndStripParam(data, activity);
    return initSession(callback, isReferrable, activity);
}