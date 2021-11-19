public static java.lang.String getBatteryLevelRequest(android.content.Context context, java.lang.String requestRecipient) {
    return context.getResources().getString(R.string.battery_level_message, org.addhen.smssync.util.Util.getBatteryLevel(context));
}