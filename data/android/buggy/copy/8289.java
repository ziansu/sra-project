@butterknife.OnClick(value = R.id.profile_update_button)
public void onUpdateUser() {
    if ((updateBtn.getText()) == "Update") {
        updateClicked();
    }else {
        cancelClicked();
    }
}