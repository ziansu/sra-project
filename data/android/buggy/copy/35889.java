public static void init() {
    mod.steamnsteel.world.WorldGen.createOreGenerators();
    mod.steamnsteel.world.WorldGen.createStructureGenerators();
    mod.steamnsteel.world.WorldGen.register();
    mod.steamnsteel.world.ore.RetroGenHandler.register();
}