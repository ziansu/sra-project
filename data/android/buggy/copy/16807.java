@java.lang.Override
public void onDetach() {
    super.onDetach();
    mListener = null;
    getActivity().unregisterReceiver(quickReceiver);
}