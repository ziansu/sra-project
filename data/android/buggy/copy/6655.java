@java.lang.Override
public void onPause() {
    super.onPause();
    com.example.emile1.findaparty.Activity.MapStateManager mgr = new com.example.emile1.findaparty.Activity.MapStateManager(getContext());
    mgr.saveMapState(googleMap);
}