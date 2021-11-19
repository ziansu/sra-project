@java.lang.Override
protected void onActivityResult(final int requestCode, final int resultCode, final android.content.Intent data) {
    if (de.azapps.mirakel.settings.SettingsHelper.handleActivityResult(requestCode, resultCode, data, this)) {
        de.azapps.mirakel.settings.model_settings.generic_list.GenericModelDetailActivity.finish();
    }
}