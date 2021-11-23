@butterknife.OnClick(value = R.id.sign_up_tv)
public void signUp() {
    startActivity(new android.content.Intent(this, com.geekhub.choosehelper.screens.activities.SignUpActivity.class));
}