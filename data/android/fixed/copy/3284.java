@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onRenderGameOverlay(net.minecraftforge.client.event.RenderGameOverlayEvent event) {
    ModItems.teleporterLinker.renderGameOverlay(event);
    renderCrosshairs(event);
}