public void run() {
    createAndShowDialog("", "Inserito!");
    mPosts.add(post);
    mPostsAdapter.notifyDataSetChanged();
}