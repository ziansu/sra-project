@java.lang.Override
public void onDestroyView() {
    if (mBound)
        getActivity().unbindService(mConnection);
    
    super.onDestroyView();
}