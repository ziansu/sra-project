public static boolean playerAtRequestLimit(java.util.UUID id) {
    java.util.List<me.becja10.MCClassifieds.Utils.Request> requests = me.becja10.MCClassifieds.MCClassifieds.playerMap.get(id);
    if (requests != null) {
        return (requests.size()) >= (me.becja10.MCClassifieds.MCClassifieds.requestLimit);
    }
    return false;
}