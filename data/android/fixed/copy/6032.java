private void initialisePresenter() {
    presenter = ((P) (com.vincenttetau.weatherapp.activities.BaseActivity.getLastCustomNonConfigurationInstance()));
    if ((presenter) == null) {
        presenter = createPresenter();
    }
}