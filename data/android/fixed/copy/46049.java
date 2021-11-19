@java.lang.Override
public void hideEmailLoading() {
    send_email.setVisibility(View.VISIBLE);
    email_pbr.setVisibility(View.GONE);
    if ((user) != null) {
        question.setText(user.getPreguntaSeguridad());
    }
}