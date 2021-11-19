public static com.photosynq.app.DiscoverFragment newInstance(int sectionNumber, java.lang.String searchString) {
    com.photosynq.app.DiscoverFragment fragment = new com.photosynq.app.DiscoverFragment();
    com.photosynq.app.DiscoverFragment.mSectionNumber = sectionNumber;
    com.photosynq.app.DiscoverFragment.mSearchString = searchString.trim().replaceAll(" ", "%20");
    return fragment;
}