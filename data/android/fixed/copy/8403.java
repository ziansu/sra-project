public static java.lang.String recordAlert(org.json.JSONObject jmessage) {
    de.xavaro.android.common.Json.put(jmessage, "priority", "alertinfo");
    return de.xavaro.android.common.ActivityManager.getInstance().onMessage(jmessage, false);
}