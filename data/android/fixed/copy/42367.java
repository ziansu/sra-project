@java.lang.Override
public void run() {
    animation.stopAnimation();
    imgConnectionError.setVisibility(View.GONE);
    presenter.onFetchData();
}