@java.lang.Override
public void onChallengeShown(boolean shown) {
    if (((progressBar) != null) && ((captchaEditText) != null)) {
        progressBar.setVisibility(View.INVISIBLE);
        captchaEditText.setVisibility(View.VISIBLE);
        captchaEditText.setText("");
    }
}