@android.support.annotation.Nullable
public static java.lang.Float getFloat(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.Nullable
java.lang.Float defaultValue) {
    long start = java.lang.System.currentTimeMillis();
    return java.lang.Float.valueOf(com.pepperonas.aesprefs.AesPrefs.get(key, java.lang.String.valueOf(defaultValue)));
}