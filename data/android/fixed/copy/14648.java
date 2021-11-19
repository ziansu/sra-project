@java.lang.Override
protected void onResume() {
    super.onResume();
    if (mCheckBox.isChecked())
        mPasswordField.setVisibility(View.VISIBLE);
    
}