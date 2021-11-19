public com.amaze.filemanager.fragments.TabFragment getTabFragment() {
    android.support.v4.app.Fragment fragment = getContentFrameFragment();
    if ((fragment == null) || (!(fragment instanceof com.amaze.filemanager.fragments.TabFragment)))
        return null;
    else
        return ((com.amaze.filemanager.fragments.TabFragment) (fragment));
    
}