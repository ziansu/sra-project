private boolean is4KEnabled() {
    if ((mProfile.quality) == (android.media.CamcorderProfile.QUALITY_2160P)) {
        return true;
    }else {
        return false;
    }
}