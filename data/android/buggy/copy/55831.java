@java.lang.Override
protected void onResume() {
    super.onResume();
    com.example.attracti.audiorecorderpicture.adapters.RecyclerViewAdapter adapter = ((com.example.attracti.audiorecorderpicture.adapters.RecyclerViewAdapter) (list.getAdapter()));
    android.util.Log.wtf("on Resume works ", "in FirstscreenActivity");
    list.getAdapter().notifyDataSetChanged();
}