@java.lang.Override
public void onResume() {
    super.onResume();
    presenter.attachView(this);
    presenter.fetchSubscriberDetails();
}