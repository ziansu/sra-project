public static me.ichun.mods.blocksteps.common.core.MapSaveFile create() {
    me.ichun.mods.blocksteps.common.core.MapSaveFile file = new me.ichun.mods.blocksteps.common.core.MapSaveFile();
    file.stepPoints = Blocksteps.eventHandler.steps;
    return file;
}