public void saveSelected(int id) {
    android.content.SharedPreferences.Editor editor = prefs.edit();
    editor.putString("city", ("" + id));
    editor.commit();
    android.util.Log.d(org.scoutant.tf.TrafficMap.tag, ("saving preference : " + id));
}