@java.lang.Override
public void onResume() {
    super.onResume();
    if (dataFetched) {
        initializeAdapter(posts);
    }
}