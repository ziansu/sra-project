private void addFuture(int totalItemCount) {
    loopPoint += visibleThreshold;
    loopPoint %= totalItemCount;
    onLoadMore(true);
}