@java.lang.Override
public void onFocusChange(android.view.View view, boolean b) {
    org.md2k.utilities.Report.Log.d(org.md2k.ema.FragmentTextNumeric.TAG, ("Focus=" + b));
    if (b)
        setEditTextFocused();
    else
        setEditTextNotFocused();
    
}