public void registerEvents() {
    super.registerEvents();
    MinecraftForge.EVENT_BUS.register(new com.blamejared.clumps.proxy.ClientEventHandler());
}