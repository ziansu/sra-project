private void updateUI() {
    if ((mAdapter) == null) {
        mAdapter = new com.oestjacobsen.android.get2gether.view.groups.SelectedGroupMembersFragment.MembersAdapter(mMembersList);
        mRecyclerView.setAdapter(mAdapter);
    }else {
        mAdapter.setList(mMembersList);
        mAdapter.notifyDataSetChanged();
    }
}