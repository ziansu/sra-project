public void setPhotoUrl(java.lang.String photoUrl) {
    if (photoUrl != null) {
        java.lang.String temp = photoUrl.substring(0, ((photoUrl.length()) - 5));
        this.photoUrl = temp + (PHOTO_URL_END);
    }
}