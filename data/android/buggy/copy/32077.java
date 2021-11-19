@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.widget.ArrayAdapter<T> adapter = new android.widget.ArrayAdapter(uk.co.yellowsquid.flashcards.fragments.SimpleListFragment.getActivity(), R.layout.list_item, items);
    setListAdapter(adapter);
    uk.co.yellowsquid.flashcards.fragments.SimpleListFragment.setRetainInstance(true);
}