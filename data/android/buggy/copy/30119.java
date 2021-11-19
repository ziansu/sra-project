public static void startCrashlytics(android.content.Context context) {
    if (!(com.musenkishi.wally.BuildConfig.DEBUG)) {
        com.crashlytics.android.Crashlytics.start(context);
    }
}