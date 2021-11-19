public static java.lang.String getSParam1(net.minecraft.entity.player.EntityPlayer playerIn) {
    return playerIn != null ? playerIn.getCapability(net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS, null).getSParam1() : "";
}