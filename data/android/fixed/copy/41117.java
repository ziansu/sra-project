void deleteFromFavorites(java.util.List<gov.nist.toolkit.configDatatypes.client.Pid> pids) {
    for (gov.nist.toolkit.configDatatypes.client.Pid pid : pids) {
        model.getList().remove(pid);
    }
    selectedPids.clear();
    selectionModel.clear();
    updateFavoritesFromModel();
}