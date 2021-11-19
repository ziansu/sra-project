@java.lang.Override
public void onChosenDir(java.lang.String chosenDir) {
    getPreferences(pl.elowski.photolauncher.MODE_PRIVATE).edit().putString(pl.elowski.photolauncher.PhotoActivity.DIRECTORY_PREFS, chosenDir).commit();
    photos = getFiles(chosenDir);
    currentPhoto = 0;
    setNextPhoto();
}