@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mAdapter = new android.widget.ArrayAdapter<ke.co.appslab.mu_graduation.fragments.dummy.DummyContent.DummyItem>(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, ke.co.appslab.mu_graduation.fragments.dummy.DummyContent.ITEMS);
}