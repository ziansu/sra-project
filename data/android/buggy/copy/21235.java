@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    com.itheima.mobilesafe.utils.CLog.d(com.itheima.mobilesafe.ui.my_viewpager.MyViewPager.TAG, "TouchEvent");
    if (this.enabled) {
        return super.onTouchEvent(event);
    }
    return false;
}