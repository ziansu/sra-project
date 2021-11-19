@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onRenderPlayerSpecialsPre(net.minecraftforge.client.event.RenderPlayerEvent.Specials.Pre event) {
    net.minecraft.entity.player.EntityPlayer player = event.entityPlayer;
    if ((fiskfille.tf.common.playerdata.TFDataManager.getTransformationTimer(player)) < 10) {
        event.setCanceled(true);
    }
}