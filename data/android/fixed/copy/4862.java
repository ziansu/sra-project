private void addPast(int totalItemCount) {
    loopPoint += totalItemCount - (visibleThreshold);
    loopPoint %= totalItemCount;
    onLoadMore(false);
}