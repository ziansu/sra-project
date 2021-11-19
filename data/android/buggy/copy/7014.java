@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    setListAdapter(new bd1415.unipd.dei.it.cardb.ClientiArrayAdapter(inflater.getContext(), ApplicationData.privati));
    mFM = getFragmentManager();
    return super.onCreateView(inflater, container, savedInstanceState);
}