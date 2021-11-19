public static java.lang.String getKeyString(java.lang.String key) {
    android.content.SharedPreferences sharedPref = com.krkeco.dateit.PrefHelper.context.getSharedPreferences("dateit", Context.MODE_PRIVATE);
    java.lang.String host = sharedPref.getString(key, null);
    com.krkeco.dateit.PrefHelper.log(("host is: " + host));
    return host;
}