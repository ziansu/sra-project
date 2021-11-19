@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    if ((s.length()) > 3)
        startButton.setEnabled(true);
    else
        startButton.setEnabled(false);
    
}