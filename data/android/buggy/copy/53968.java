@java.lang.Override
public void onLoadMore() {
    android.util.Log.i(com.enthusiast94.reddit_reader.app.fragments.PostsFragment.TAG, "onLoadMore");
    loadPosts(subreddit, sort, after);
}