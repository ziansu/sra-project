@java.lang.Override
public void run() {
    if ((mCubeList) == null)
        return ;
    
    updateStatus();
    postInvalidate();
}