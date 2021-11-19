public void run() {
    createAndShowDialog("", "Inserito!");
    mPosts.add(0, post);
    mPostsAdapter.notifyDataSetChanged();
}