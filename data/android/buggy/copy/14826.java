private void setItemsArray(@android.support.annotation.ArrayRes
int arrayResId, @android.support.annotation.LayoutRes
int spinnerItemRes, @android.support.annotation.LayoutRes
int dropdownViewRes) {
    android.widget.ArrayAdapter<java.lang.CharSequence> adapter = android.widget.ArrayAdapter.createFromResource(getContext(), arrayResId, spinnerItemRes);
    adapter.setDropDownViewResource(dropdownViewRes);
    mSpinner.setAdapter(adapter);
}