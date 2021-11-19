private void removeUserFilter() {
    android.content.SharedPreferences preferences = getActivity().getPreferences(Activity.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = preferences.edit();
    tech.niemandkun.domain.FilterSettings.deleteFromPreferences(editor);
    editor.apply();
}