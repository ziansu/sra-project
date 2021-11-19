@java.lang.Override
public void onClick(android.view.View v) {
    dismiss();
    if ((onSaveListener) != null) {
        onSaveListener.onSave(mEditText.getText().toString(), task);
    }
}