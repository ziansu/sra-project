public void setDismissListener(com.jpeng.jptabbar.BadgeDismissListener listener) {
    if ((mJPTabItems) != null)
        for (com.jpeng.jptabbar.JPTabItem item : mJPTabItems) {
            item.setDismissDelegate(listener);
        }
    
}