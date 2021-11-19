@org.androidannotations.annotations.UiThread
void displayListView(org.ovirt.mobile.movirt.rest.Disks disks) {
    if (((listView) != null) && (disks != null)) {
        diskListAdapter = new org.ovirt.mobile.movirt.ui.DiskListAdapter(getActivity(), 0, disks);
        listView.setAdapter(diskListAdapter);
    }
}