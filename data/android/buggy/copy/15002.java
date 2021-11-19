public void updateSort(java.lang.String sort) {
    this.sort = sort;
    after = null;
    loadPosts(subreddit, this.sort, after);
}