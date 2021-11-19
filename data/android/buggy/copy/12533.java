@java.lang.Override
public void hide() {
    mNavigationBarView.setVisibility(View.GONE);
    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = ((android.view.ViewGroup.MarginLayoutParams) (mNavigationBarContentContainer.getLayoutParams()));
    marginLayoutParams.topMargin = 0;
    mNavigationBarContentContainer.setLayoutParams(marginLayoutParams);
}