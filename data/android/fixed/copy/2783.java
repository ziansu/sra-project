@java.lang.Override
public void registerMixinClass(java.lang.String name, byte[] bytecode) {
    org.spongepowered.tools.agent.MixinAgent.classLoader.addMixinClass(name);
}