@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void preLoad(com.forgeessentials.util.events.FEModuleEvent.FEModulePreInitEvent event) {
    com.forgeessentials.api.APIRegistry.scripts = this;
    new com.forgeessentials.scripting.ScriptEventHandler();
}