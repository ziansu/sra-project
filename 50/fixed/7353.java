@org.chromium.base.VisibleForTesting
public static boolean getFirstRunFlowSignInComplete(android.content.Context context) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(org.chromium.chrome.browser.firstrun.FirstRunSignInProcessor.FIRST_RUN_FLOW_SIGNIN_COMPLETE, false);
}