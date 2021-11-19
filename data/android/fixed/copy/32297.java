@java.lang.Override
public void OnFalure(java.lang.String msg) {
    isLoading = false;
    if ((mView) == null)
        return ;
    
    android.util.Log.e("tag", ("onFalure    " + msg));
    mView.showMsg(msg);
    mView.hideProgress();
}