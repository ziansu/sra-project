java.lang.String getPace() {
    java.lang.String str = settingPref.getString("Pace", "0");
    android.util.Log.i("getPace()", Pace);
    return str;
}