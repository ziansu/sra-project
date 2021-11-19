public static java.lang.String getBatteryLevelRequest(android.content.Context context) {
    return context.getResources().getString(R.string.battery_level_message, org.addhen.smssync.util.Util.getBatteryLevel(context));
}