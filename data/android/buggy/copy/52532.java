@android.support.annotation.Nullable
public static java.lang.Double getDouble(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.Nullable
java.lang.Double defaultValue) {
    long start = java.lang.System.currentTimeMillis();
    return java.lang.Double.valueOf(com.pepperonas.aesprefs.AesPrefs.get(key, java.lang.String.valueOf(defaultValue)));
}