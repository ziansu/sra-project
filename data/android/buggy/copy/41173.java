public static void stop() {
    org.radargun.cachewrappers.DCManager.localConnection.close();
    for (org.radargun.cachewrappers.AntidoteConnection connection : org.radargun.cachewrappers.DCManager.connections)
        connection.close();
    
}