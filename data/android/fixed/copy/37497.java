public static void destroyPicture() {
    if ((nl.hanze.myhealth.Camera.mCurrentPhotoPath) == null) {
        return ;
    }
    new java.io.File(nl.hanze.myhealth.Camera.mCurrentPhotoPath).delete();
    nl.hanze.myhealth.Camera.mCurrentPhotoPath = null;
}