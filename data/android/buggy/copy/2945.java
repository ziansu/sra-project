@java.lang.Override
public void onLoadMore(int current_page) {
    page = current_page;
    new com.androidbelieve.drawerwithswipetabs.FilmsFragment.LoadFilms().execute();
}