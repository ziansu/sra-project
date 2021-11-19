public static java.lang.String recordActivity(org.json.JSONObject jmessage) {
    return de.xavaro.android.common.ActivityManager.getInstance().onMessage(jmessage, false);
}