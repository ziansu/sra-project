public static java.util.List<net.aeronica.mods.mxtune.options.PlayerLists> getBlackList(net.minecraft.entity.player.EntityPlayer playerIn) {
    return playerIn != null ? playerIn.getCapability(net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS, null).getBlackList() : java.util.Collections.emptyList();
}