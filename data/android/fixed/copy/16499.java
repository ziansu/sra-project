@java.lang.Override
public void onViewAttachedToWindow(org.bottiger.podcast.views.PlaylistViewHolder holder) {
    super.onViewAttachedToWindow(holder);
    org.bottiger.podcast.SoundWaves.getBus().register(holder.mPlayPauseButton);
    org.bottiger.podcast.SoundWaves.getBus().register(holder.seekbar);
}