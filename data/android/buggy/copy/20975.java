public void init(com.bte.mod.proxy.FMLInitializationEvent event) {
    CapabilityManager.INSTANCE.register(com.bte.mod.capability.ICharge.class, new com.bte.mod.capability.ChargeStorage(), com.bte.mod.capability.Charge.class);
    MinecraftForge.EVENT_BUS.register(new com.bte.mod.capability.CapabilityHandler());
}