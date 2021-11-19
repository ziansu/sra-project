@java.lang.Override
public void showNoContent() {
    mContacts = new java.util.ArrayList<>();
    if ((mAdapter.getItemCount()) == 0) {
        mInfoTextView.setVisibility(View.VISIBLE);
        mInfoTextView.setText(getString(R.string.no_contacts));
    }
}