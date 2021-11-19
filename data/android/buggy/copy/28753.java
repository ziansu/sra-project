@java.lang.Override
public void onBackPressed() {
    flagMenuSounds = false;
    flagMenuRating = false;
    flagMenuPictures = false;
    onResume();
}