public static boolean deleteAllClusters() {
    java.util.List<java.lang.String> result = pt.ulisboa.tecnico.amorphous.requestrouter.internal.lvs.LVSImplementation.executeCommand(pt.ulisboa.tecnico.amorphous.requestrouter.internal.lvs.LVSImplementation.CMD_CLEAR_CLUSTERS);
    if ((result == null) || (result.isEmpty()))
        return false;
    else
        return true;
    
}