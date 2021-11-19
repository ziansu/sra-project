@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    mx.evin.apps.words.view.fragments.SearchTermGoogleFragment.searchTerm = s.toString().toLowerCase();
}