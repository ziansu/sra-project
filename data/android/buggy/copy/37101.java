public void removeOnSongChangeListener(github.daneren2005.dsub.service.DownloadService.OnSongChangedListener listener) {
    synchronized(onSongChangedListeners) {
        int index = onSongChangedListeners.indexOf(listener);
        if (index != (-1)) {
            onSongChangedListeners.remove(index);
        }
    }
}