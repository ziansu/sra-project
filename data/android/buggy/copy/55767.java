private static void initFS() {
    if (!(data.scripts.FreespaceModPlugin.isExerelin)) {
        new data.scripts.world.freespace.fs_gen().generate(com.fs.starfarer.api.Global.getSector());
    }
}