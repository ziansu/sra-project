@java.lang.Override
public android.view.View onCreateInputView() {
    keyboardView = ((android.inputmethodservice.KeyboardView) (getLayoutInflater().inflate(R.layout.keyboard, null)));
    keyboard = new android.inputmethodservice.Keyboard(this, R.xml.alpha);
    keyboardView.setOnKeyboardActionListener(this);
    return keyboardView;
}