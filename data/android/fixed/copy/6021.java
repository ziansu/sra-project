@butterknife.OnClick(value = R.id.label_touch_target)
public void labelTouch() {
    if (mResolutionLayoutVisible) {
        return ;
    }
    finishWithResult("label");
}