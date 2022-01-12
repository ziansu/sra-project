@java.lang.Override
public void showNoContent() {
    if ((mAdapter.getItemCount()) == 0) {
        mInfoTextView.setVisibility(View.VISIBLE);
        mInfoTextView.setText(getString(R.string.no_contacts));
    }
}