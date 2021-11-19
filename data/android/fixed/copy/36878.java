@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    if (verticalOffset <= 0) {
        translateContent(verticalOffset);
        animatePinningView(verticalOffset);
    }
}