@java.lang.Override
public greenapp.model.sound.Playlist getPlaylistById(int id) {
    return playlistDao.findById(id);
}