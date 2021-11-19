@java.lang.Override
public void onUrlDirectionChanged(int layoutDirection) {
    org.chromium.base.ApiCompatibilityUtils.setLayoutDirection(this, layoutDirection);
    updateSuggestionsLayoutDirection(layoutDirection);
}