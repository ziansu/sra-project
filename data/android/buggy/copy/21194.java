public static java.lang.Integer getPlayersPlayID(java.lang.Integer entityID) {
    net.aeronica.mods.mxtune.groups.PlayManager.playID = (((net.aeronica.mods.mxtune.groups.PlayManager.membersPlayID) != null) && (!(net.aeronica.mods.mxtune.groups.PlayManager.membersPlayID.isEmpty()))) ? net.aeronica.mods.mxtune.groups.PlayManager.membersPlayID.get(entityID) : null;
    return net.aeronica.mods.mxtune.groups.PlayManager.playID;
}