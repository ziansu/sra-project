@net.minecraftforge.fml.common.Mod.EventHandler
public void preinit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    io.cyb3rwarri0r8.friendnamer.FriendNamer.configFile = new net.minecraftforge.common.config.Configuration(event.getSuggestedConfigurationFile());
    io.cyb3rwarri0r8.friendnamer.client.ConfigHandler.init(io.cyb3rwarri0r8.friendnamer.FriendNamer.configFile.getConfigFile());
    io.cyb3rwarri0r8.friendnamer.FriendNamer.modMetadata = event.getModMetadata();
    io.cyb3rwarri0r8.friendnamer.FriendNamer.configFile.load();
}