@java.lang.Override
@org.xwalk.core.internal.XWalkAPI
public void setOnTouchListener(android.view.View.OnTouchListener l) {
    if ((mContent) == null)
        return ;
    
    org.xwalk.core.internal.XWalkViewInternal.checkThreadSafety();
    super.setOnTouchListener(l);
}