public java.lang.String getSavePath() {
    java.lang.String mcDataLocation = cpw.mods.fml.server.FMLServerHandler.instance().getSavesDirectory().getAbsolutePath();
    return mcDataLocation.substring(0, ((mcDataLocation.length()) - 2));
}