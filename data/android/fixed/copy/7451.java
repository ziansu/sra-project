@java.lang.Override
public void onBackPressed() {
    if (keyboard.isCustomKeyboardVisible()) {
        keyboard.hideCustomKeyboard();
        return ;
    }
    if (container.onBackHandle())
        return ;
    
    presenter.onBackPressed();
}