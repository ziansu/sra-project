@butterknife.OnClick(value = R.id.consumables_countdown_image)
public void onCountdownClick() {
    if (getTimer().isRunning()) {
        return ;
    }
    resetAnimation.cancel();
    startAnimation.start();
}