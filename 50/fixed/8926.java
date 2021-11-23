public void addCheckbox(@android.support.annotation.StringRes
int titleId, @android.support.annotation.StringRes
int commentId, java.lang.String property, android.view.View.OnClickListener listener) {
    addModel(com.kaliturin.blacklist.adapters.SettingsArrayAdapter.Model.CHECKBOX, getString(titleId), getString(commentId), property, listener);
}