public boolean onBackPressedImpl(@android.support.annotation.NonNull
V v) {
    VP presenter = getPresenter(v);
    return (presenter != null) && (presenter.onBackPressed(v));
}