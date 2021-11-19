@java.lang.Override
public void onResume() {
    super.onResume();
    if ((Build.VERSION.SDK_INT) >= 19)
        hideStatusAndNavigationBars();
    
}