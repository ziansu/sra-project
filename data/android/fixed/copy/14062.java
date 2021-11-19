@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onRenderPlayerSpecialsPre(net.minecraftforge.client.event.RenderPlayerEvent.Specials.Pre event) {
    if ((fiskfille.tf.common.playerdata.TFDataManager.getTransformationTimer(event.entityPlayer)) < 10) {
        event.setCanceled(true);
    }
}