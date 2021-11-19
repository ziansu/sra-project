@com.google.common.eventbus.Subscribe
public void handleTileEvent(event.TilesEvent e) {
    updateTiles(e.getExtended());
}