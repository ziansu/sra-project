@java.lang.Override
public void onDestroy() {
    rootView.getViewTreeObserver().removeOnGlobalLayoutListener(list);
}