public static void putFloat(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.Nullable
java.lang.Float value) {
    long start = java.lang.System.currentTimeMillis();
    com.pepperonas.aesprefs.AesPrefs.put(key, java.lang.String.valueOf(value));
    com.pepperonas.aesprefs.AesPrefs.mDuration += (java.lang.System.currentTimeMillis()) - start;
}