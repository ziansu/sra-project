@java.lang.Override
public void showPhotos() {
    if ((mCurrentFragment) instanceof cn.iotguard.sce.presentation.ui.fragments.GalleryFragment)
        return ;
    
    mCurrentFragment = cn.iotguard.sce.presentation.ui.fragments.GalleryFragment.newInstance();
    cn.iotguard.common.utils.Utils.showFragment(this, R.id.fragment_container, mCurrentFragment);
}