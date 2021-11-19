@butterknife.OnClick(value = R.id.btnSignup)
public void onRegisterButtonClicked() {
    if ((mListener) != null) {
        mListener.onRegisterButtonClicked();
    }
}