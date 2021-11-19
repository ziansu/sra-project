private void add(com.etiennelawlor.loop.network.models.Video item) {
    mVideos.add(item);
    notifyItemInserted(((mVideos.size()) - 1));
}