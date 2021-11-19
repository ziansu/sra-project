@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    if ((mListener) != null) {
        mProgressDialog.cancel();
        org.wordpress.android.analytics.AnalyticsTracker.track(AnalyticsTracker.Stat.LOGIN_MAGIC_LINK_REQUESTED);
        mListener.onMagicLinkSent();
    }
}