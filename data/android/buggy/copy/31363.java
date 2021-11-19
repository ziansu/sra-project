public static boolean requestActivity(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
java.lang.Class tClass, int updateRate) {
    return com.adsamcik.signalcollector.services.ActivityService.requestActivity(context, tClass.hashCode(), updateRate);
}