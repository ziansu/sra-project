public com.etiennelawlor.loop.network.models.Video getItem(int position) {
    try {
        return mVideos.get(position);
    } catch (java.lang.IndexOutOfBoundsException e) {
        timber.log.Timber.e(e, "index is %d, and size is %d", position, getItemCount());
        return null;
    }
}