private void initView() {
    mPicker = new wuxian.me.filepicker.FilePickerImpl(this, new wuxian.me.filepicker.ListViewProxy(getBaseContext(), ((android.widget.ListView) (findViewById(R.id.listView)))), mListener);
    mPicker.listRootFiles();
}