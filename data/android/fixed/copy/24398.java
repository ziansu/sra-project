@java.lang.Override
public void showLiveVideo(java.lang.String cid, java.lang.String username, java.lang.String password) {
    if ((mCurrentFragment) instanceof cn.iotguard.sce.presentation.ui.fragments.LiveVideoFragment)
        return ;
    
    mCurrentFragment = cn.iotguard.sce.presentation.ui.fragments.LiveVideoFragment.newInstance(cid, username, password);
    cn.iotguard.common.utils.Utils.showFragment(this, R.id.fragment_container, mCurrentFragment);
}