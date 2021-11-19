@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    addFragment(com.mrebhan.disqus.fragment.PostsFragment.getInstance("894832"), false);
}