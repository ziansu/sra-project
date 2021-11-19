@java.lang.Override
protected void onResume() {
    super.onResume();
    presenter.getWeather();
    mCurrentPresenter.getData();
}