private boolean is4KEnabled() {
    if (((mProfile.quality) == (android.media.CamcorderProfile.QUALITY_2160P)) || ((mProfile.quality) == (android.media.CamcorderProfile.QUALITY_4kDCI))) {
        return true;
    }else {
        return false;
    }
}