@java.lang.Override
public void signalLockError() {
    minetweaker.MineTweakerAPI.getLogger().logError("Reload of scripts blocked (script lock)");
    if (net.minecraft.client.Minecraft.isGuiEnabled()) {
        net.minecraft.client.Minecraft.getMinecraft().displayGuiScreen(new minetweaker.mc1710.GuiCannotRemodify("Minecraft has been tweaked for another server", "with modifications that cannot be rolled back.", "Please restart your game."));
    }
}