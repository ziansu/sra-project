@java.lang.Override
public boolean canDisplay3DButton() {
    return ((bShow3DButton) && (mShowBars)) && (!(mPhotoView.getFilmMode()));
}