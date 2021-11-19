public boolean hasPermission(mytown.entities.Resident res, mytown.entities.flag.FlagType type, java.lang.Object denialValue) {
    if (flagsContainer.getValue(type).equals(denialValue)) {
        return myessentials.utils.PlayerUtils.isOp(res.getPlayer());
    }
    return true;
}