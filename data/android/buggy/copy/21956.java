@android.support.annotation.Nullable
public static java.lang.Long getLong(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.Nullable
java.lang.Long defaultValue) {
    long start = java.lang.System.currentTimeMillis();
    return java.lang.Long.valueOf(com.pepperonas.aesprefs.AesPrefs.get(key, java.lang.String.valueOf(defaultValue)));
}