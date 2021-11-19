@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isInSearchUi())) {
        mActionBarController.onSearchBoxTapped();
        enterSearchUi(false, mSearchView.getText().toString());
    }
}