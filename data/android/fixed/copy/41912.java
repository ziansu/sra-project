public void updatePosts(java.util.List<com.theratio.utilities.Post> results, android.support.v7.widget.RecyclerView.Adapter adapterToNotify) {
    com.theratio.utilities.Post.updatePostsByUserID(this.id, results, adapterToNotify, false);
}