@java.lang.Override
public void onPause() {
    super.onPause();
    if ((mNotifyListener) != null)
        mNotifyListener.showActionbar();
    
}