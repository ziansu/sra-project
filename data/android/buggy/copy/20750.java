@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (mRbName.isChecked()) {
        mActvNamePreview.setText(s);
    }else {
        mActvLocationPreview.setText(s);
    }
}