public static boolean requestActivity(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
java.lang.Class tClass) {
    return com.adsamcik.signalcollector.services.ActivityService.requestActivity(context, tClass.hashCode(), com.adsamcik.signalcollector.utility.Preferences.get(context).getInt(Preferences.PREF_ACTIVITY_UPDATE_RATE, Preferences.DEFAULT_ACTIVITY_UPDATE_RATE));
}