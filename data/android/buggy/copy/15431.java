@java.lang.Override
public void showPhotos() {
    mCurrentFragment = cn.iotguard.sce.presentation.ui.fragments.GalleryFragment.newInstance();
    cn.iotguard.common.utils.Utils.showFragment(this, R.id.fragment_container, mCurrentFragment);
}