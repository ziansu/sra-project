@java.lang.Override
public void run() {
    com.alexpansion.gts.utility.ValueManager manager = com.alexpansion.gts.utility.ValueManager.getManager(net.minecraft.client.Minecraft.getMinecraft().theWorld);
    manager.setBean(message.getBean());
}