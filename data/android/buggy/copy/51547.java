@java.lang.Override
public void onClick(android.view.View view) {
    registerPresenter.register(emailText.getText().toString(), nameText.getText().toString(), pwText.getText().toString());
}