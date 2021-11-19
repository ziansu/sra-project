@butterknife.OnClick(value = R.id.view_helper_overlay_button)
void dismissOverlay() {
    if ((getParent()) != null) {
        ((android.view.ViewGroup) (getParent())).removeView(this);
    }
}