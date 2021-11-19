public static boolean isMuteAll(net.minecraft.entity.player.EntityPlayer playerIn) {
    return (net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS) != null ? (playerIn.getCapability(net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS, null).getMuteOption()) == (net.aeronica.mods.mxtune.options.MusicOptionsUtil.EnumMuteOptions.ALL.getMetadata()) : false;
}