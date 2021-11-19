@java.lang.Override
protected void onResume() {
    super.onResume();
    this.presenter = new task.application.com.moviefinder.ui.itemdetail.SearchItemDetailPresenter(fragment);
}