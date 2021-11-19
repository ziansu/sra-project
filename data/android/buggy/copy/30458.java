public final void addRank(mytown.datasource.Rank rank) {
    ranks.add(rank);
    mypermissions.api.command.CommandCompletion.addCompletion("rankCompletion", rank.getName());
}