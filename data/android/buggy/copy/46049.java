@java.lang.Override
public void hideEmailLoading() {
    send_email.setVisibility(View.VISIBLE);
    email_pbr.setVisibility(View.GONE);
    question.setText(user.getPreguntaSeguridad());
}