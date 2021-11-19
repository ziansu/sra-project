java.lang.String getPace() {
    java.lang.String str = settingPref.getString("Pace", "0");
    android.util.Log.i("getPace()", str);
    return str;
}