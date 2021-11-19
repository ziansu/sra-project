@butterknife.OnClick(value = R.id.btn_save)
public void onSaveClicked() {
    if (((listener) != null) && (validateName())) {
        listener.onSaveClicked(txtName.getText().toString());
    }
    dialog.dismiss();
}