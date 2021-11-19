public final void removeResident(mytown.datasource.Resident res) {
    residents.remove(res);
    mypermissions.api.command.CommandCompletion.removeCompletion("residentCompletion", res.getPlayerName());
}