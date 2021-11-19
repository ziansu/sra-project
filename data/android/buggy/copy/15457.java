@java.lang.Override
public void onTrackEnd(com.sedmelluq.discord.lavaplayer.player.AudioPlayer player, com.sedmelluq.discord.lavaplayer.track.AudioTrack track, com.sedmelluq.discord.lavaplayer.track.AudioTrackEndReason endReason) {
    requester.remove(0);
    if (endReason.mayStartNext) {
        nextTrack();
    }
}