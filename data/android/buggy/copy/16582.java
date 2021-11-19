public com.danimahardhika.cafebar.CafeBar.Builder customView(@android.support.annotation.LayoutRes
int res) {
    mCustomView = android.view.View.inflate(mContext, res, null);
    return this;
}