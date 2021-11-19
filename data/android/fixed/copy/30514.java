public void saveSelected(int id) {
    editor.putString("city", ("" + id));
    editor.commit();
    android.util.Log.d(org.scoutant.tf.TrafficMap.tag, ("saving preference : " + id));
}