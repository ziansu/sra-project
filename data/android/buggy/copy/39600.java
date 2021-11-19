public static void recordAlert(int resid) {
    org.json.JSONObject jmessage = new org.json.JSONObject();
    de.xavaro.android.common.Json.put(jmessage, "message", de.xavaro.android.common.Simple.getTrans(resid));
    de.xavaro.android.common.ActivityManager.recordAlert(jmessage);
}