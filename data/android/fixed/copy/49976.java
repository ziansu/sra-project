@java.lang.Override
public void onViewDetachedFromWindow(org.bottiger.podcast.views.PlaylistViewHolder holder) {
    org.bottiger.podcast.SoundWaves.getBus().unregister(holder.mPlayPauseButton);
    org.bottiger.podcast.SoundWaves.getBus().unregister(holder.seekbar);
    super.onViewDetachedFromWindow(holder);
}