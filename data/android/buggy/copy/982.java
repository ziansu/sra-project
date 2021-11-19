public static boolean isEmpty(java.lang.String string) {
    return ((android.text.TextUtils.isEmpty(string)) || ((string.trim().length()) == 0)) || (com.destin.sehaikun.StringUtils.NULL.equalsIgnoreCase(string));
}