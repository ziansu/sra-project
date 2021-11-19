public net.minecraft.entity.player.EntityPlayer getAdmin(int gameID) {
    if ((39 < gameID) || (gameID < 0))
        return null;
    
    if ((gameList[gameID]) == null)
        return null;
    
    return gameList[gameID].getAdmin();
}