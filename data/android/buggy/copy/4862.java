private void addPast(int totalItemCount) {
    loopPoint += totalItemCount - (visibleThreshold);
    loopPoint %= totalItemCount;
    onLoadMore(0, totalItemCount, false);
}