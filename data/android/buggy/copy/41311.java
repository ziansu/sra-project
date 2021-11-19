public boolean onOptionsItemSelectedImpl(@android.support.annotation.NonNull
V v, android.view.MenuItem item) {
    VP presenter = getPresenter(v);
    return (presenter != null) && (presenter.onOptionsItemSelected(v, item));
}