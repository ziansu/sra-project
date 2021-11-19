private void addFuture(int totalItemCount) {
    loopPoint += visibleThreshold;
    loopPoint %= totalItemCount;
    onLoadMore(0, totalItemCount, true);
}