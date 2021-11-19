public void setImmersive(boolean immersive) {
    mImmersive = immersive;
    if (mImmersive) {
        mStatusBarHeight += com.bacy.view.titlebar.TitleBar.getStatusBarHeight();
    }
}