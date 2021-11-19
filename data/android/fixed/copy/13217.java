@java.lang.Override
public void onFocusChange(android.view.View view, boolean b) {
    if (b)
        setEditTextFocused();
    else
        setEditTextNotFocused();
    
}