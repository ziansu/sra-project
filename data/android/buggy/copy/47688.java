public static im.vector.util.RoomDirectoryData getDefault() {
    if (null == (im.vector.util.RoomDirectoryData.sDefault)) {
        im.vector.util.RoomDirectoryData.sDefault = new im.vector.util.RoomDirectoryData(null, im.vector.util.RoomDirectoryData.DEFAULT_HOME_SERVER_NAME, null, null, false);
    }
    return im.vector.util.RoomDirectoryData.sDefault;
}