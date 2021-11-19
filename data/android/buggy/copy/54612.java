public final void addTown(mytown.datasource.Town town) {
    towns.add(town);
    mypermissions.api.command.CommandCompletion.addCompletion("townCompletionAndAll", town.getName());
    mypermissions.api.command.CommandCompletion.addCompletion("townCompletion", town.getName());
}