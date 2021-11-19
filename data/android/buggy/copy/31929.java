@java.lang.Override
public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
    view.onApplyWindowInsets(windowInsets);
    mTopInset = windowInsets.getSystemWindowInsetTop();
    mUpButtonContainer.setTranslationY(mTopInset);
    updateUpButtonPosition();
    return windowInsets;
}