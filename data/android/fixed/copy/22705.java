@java.lang.Override
public void onConfigurationChanged(final android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    if (de.azapps.mirakel.helper.MirakelCommonPreferences.isTablet()) {
        setResult(de.azapps.mirakel.settings.model_settings.generic_list.GenericModelDetailActivity.SWITCH_LAYOUT, getIntent());
        finish();
    }
}