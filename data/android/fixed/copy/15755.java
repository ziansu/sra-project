private void repositionNavigationBar() {
    if (((mNavigationBarView) == null) || (!(mNavigationBarView.isAttachedToWindow())))
        return ;
    
    prepareNavigationBarView();
    mWindowManager.updateViewLayout(mNavigationBarView, getNavigationBarLayoutParams());
}