public static void recordActivity(org.json.JSONObject jmessage) {
    de.xavaro.android.common.ActivityManager.getInstance().onMessage(jmessage, false);
}