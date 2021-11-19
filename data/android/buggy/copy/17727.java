@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    newsItem = ((com.newsbuzz.NewsItem) (getArguments().getSerializable(com.newsbuzz.NewsFragment.EXTRA_NEWS_ID)));
    setHasOptionsMenu(true);
}