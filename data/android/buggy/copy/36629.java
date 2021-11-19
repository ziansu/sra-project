@java.lang.Override
public void onChallengeShown(boolean shown) {
    progressBar.setVisibility(View.INVISIBLE);
    captchaEditText.setVisibility(View.VISIBLE);
    captchaEditText.setText("");
}