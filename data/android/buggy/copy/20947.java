public boolean hasPermission(mytown.entities.Resident res, mytown.entities.flag.FlagType type, java.lang.Object denialValue) {
    if ((flagsContainer.get(type).getValue()) == denialValue) {
        return myessentials.utils.PlayerUtils.isOp(res.getPlayer());
    }
    return true;
}