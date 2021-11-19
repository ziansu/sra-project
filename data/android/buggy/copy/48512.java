@java.lang.Override
public void onNext(java.lang.String s) {
    super.onNext(s);
    view.navigateToSplash();
    view.hideProgress();
}