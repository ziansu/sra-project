@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((presenter) == null)
        this.presenter = new task.application.com.moviefinder.ui.itemdetail.SearchItemDetailPresenter(fragment);
    
}