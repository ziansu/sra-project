@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    this.setListAdapter(new com.group.cs.wi_free.DeviceListFragment.WifiPeerListAdapter(getActivity(), R.layout.row_devices, peers));
}