@net.minecraftforge.fml.common.eventhandler.SubscribeEvent(priority = net.minecraftforge.fml.common.eventhandler.EventPriority.LOWEST)
public static void renderLast(net.minecraftforge.client.event.RenderWorldLastEvent event) {
    while (!(code.elix_x.excore.utils.client.render.wtw.WTWRenderer.renderingQueue.isEmpty())) {
        code.elix_x.excore.utils.client.render.wtw.WTWRenderer.renderNow(code.elix_x.excore.utils.client.render.wtw.WTWRenderer.renderingQueue.peek().getLeft(), code.elix_x.excore.utils.client.render.wtw.WTWRenderer.renderingQueue.poll().getRight());
    } 
}