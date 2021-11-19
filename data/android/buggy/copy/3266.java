@java.lang.Override
public void onEvent(com.kaltura.playkit.PKEvent event) {
    if ((player.getDuration()) > 0) {
        setPluginOptions();
    }
}