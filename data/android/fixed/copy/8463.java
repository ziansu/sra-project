@java.lang.Override
public void onStopNestedScroll(android.view.View child, int type) {
    super.onStopNestedScroll(child, type);
    if ((java.lang.Math.abs(swipeDistance)) >= (nich.work.aequorea.common.ui.widget.SwipeBackCoordinatorLayout.SWIPE_TRIGGER)) {
        swipeBack();
    }else {
        reset();
    }
}