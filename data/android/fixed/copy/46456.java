@java.lang.Override
public void navigateTo(java.lang.String navigationState) {
    try {
        super.navigateTo(navigationState);
        this.viewMenuLayout.getViewMenu().navigateTo(navigationState);
    } catch (java.lang.Exception e) {
        handleNavigationError(navigationState, e);
    }
}