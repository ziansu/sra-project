private boolean shouldSaveLastActiveFragment() {
    return getSharedPreferencesHelper().get(SettingsFragmentPresenter.REMEMBER_LAST_ACTIVE_CATEGORY_PREFERENCE_KEY, false);
}