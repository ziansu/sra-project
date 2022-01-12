@java.lang.Override
public void onLoadMore() {
    mPresenter.getMoviesByTitle(title, current_page);
    (current_page)++;
}