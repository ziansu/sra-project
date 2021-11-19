@java.lang.Override
public void showPosts(java.util.List<com.ruflux.redpaper.data.model.Post> posts) {
    mAdapter.setItems(posts);
    mAdapter.notifyDataSetChanged();
}