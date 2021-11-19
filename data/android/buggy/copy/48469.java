@java.lang.Override
public void onTextChanged(java.lang.CharSequence charSequence, int i, int i1, int i2) {
    java.lang.String content = mTranslatedStringEditText.getText().toString();
    mSelectedLocaleResources.setContent(mSelectedResourceId, content);
}