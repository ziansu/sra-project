@java.lang.Override
public void play(agency.tango.skald.core.models.SkaldPlaylist playlist) {
    try {
        deezerPlayer.play(playlist);
    } catch (com.deezer.sdk.network.request.event.DeezerError deezerError) {
        deezerError.getMessage();
        deezerError.printStackTrace();
    }
}