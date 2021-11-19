@java.lang.Override
public void onClick(android.view.View v) {
    mSearchQuery = mSearchBox.getText().toString();
    java.lang.String searchScope = mStringSearchScope;
    mainFragmentListener.getSearchInfo(mSearchQuery, searchScope);
}