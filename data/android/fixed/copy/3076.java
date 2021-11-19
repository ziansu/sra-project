@java.lang.Override
public boolean canDisplay3DButton() {
    return ((bShow3DButton) && (mShowBars)) && ((mPhotoView) == null ? false : !(mPhotoView.getFilmMode()));
}