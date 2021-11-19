@java.lang.Override
public void showSettingsPage() {
    showFragment(AppNavigationEnum.SETTINGS.getFragmentTag(), null, AppNavigationEnum.SETTINGS.getTitle(), false);
}