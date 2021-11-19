@butterknife.OnClick(value = R.id.stn_info_close)
public void onClose() {
    showInfoAnim.setAnimationListener(null);
    showInfoAnim.cancel();
    hideProgressBar.setAnimationListener(null);
    hideProgressBar.cancel();
    progressBar.setVisibility(View.INVISIBLE);
    collapseAnimation.start();
}