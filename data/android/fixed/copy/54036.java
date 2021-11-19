public static void setSParams(net.minecraft.entity.player.EntityPlayer playerIn, java.lang.String sParam1, java.lang.String sParam2, java.lang.String sParam3) {
    if ((net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS) != null)
        playerIn.getCapability(net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS, null).setSParams(playerIn, sParam1, sParam2, sParam3);
    
}