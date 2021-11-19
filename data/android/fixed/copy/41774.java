private void notifyUpdated(java.util.List<com.airmap.airmapsdk.models.traffic.AirMapTraffic> updated) {
    if (updated == null) {
        return ;
    }
    for (com.airmap.airmapsdk.networking.callbacks.AirMapTrafficListener listener : listeners) {
        if (listener != null) {
            listener.onUpdateTraffic(updated);
        }
    }
}