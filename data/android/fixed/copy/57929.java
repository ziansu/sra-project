@java.lang.Override
public void updateMusicSource(com.arde.media.common.MusicSource musicSource) {
    if (musicSource.equals(this.musicSource))
        return ;
    
    this.musicSource = musicSource;
    musicSource.setReady(false);
    reIndexMusicSource();
}