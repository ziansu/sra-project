@java.lang.Override
public void onResume() {
    super.onResume();
    if (!(registered)) {
        getActivity().registerReceiver(broadcastClass, new android.content.IntentFilter(cell.signalwatcher.CellSignalFragment.BROADCAST_PACKAGE));
    }
}