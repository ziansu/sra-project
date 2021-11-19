@java.lang.Override
public void onStop() {
    super.onStop();
    getActivity().unregisterReceiver(errorReceiver);
    showDataFactory.stop();
    podcastDataFactory.stop();
}