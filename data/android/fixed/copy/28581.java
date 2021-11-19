private AlbumError.Item findSameErrorType(be.home.common.enums.MP3Tag type) {
    be.home.model.json.AlbumError.Item item = null;
    for (be.home.model.json.AlbumError.Item errorItem : this.songErrors) {
        if (errorItem.type.equals(type.name())) {
            item = errorItem;
            break;
        }
    }
    return item;
}