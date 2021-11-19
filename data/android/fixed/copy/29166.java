private void initMediaAdapter() {
    java.util.List<net.opendasharchive.openarchive.db.Media> list = net.opendasharchive.openarchive.db.Media.getAllMediaAsList();
    mMediaAdapter = new net.opendasharchive.openarchive.db.MediaAdapter(this.getActivity(), R.layout.activity_media_list_row, list);
    setListAdapter(mMediaAdapter);
}