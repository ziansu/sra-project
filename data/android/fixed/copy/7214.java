public void modifyAlbum(java.lang.Long albumId) {
    for (com.bcdlog.shared.model.AlbumModel album : getUserAlbums()) {
        if (album.getId().equals(albumId)) {
            albumModel = album;
            break;
        }
    }
    titleArea.updateAlbum(albumModel);
}