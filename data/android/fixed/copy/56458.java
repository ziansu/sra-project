@java.lang.Override
public void onPause() {
    if (serviceBound.getValue())
        getActivity().unbindService(mConnection);
    
    super.onPause();
}