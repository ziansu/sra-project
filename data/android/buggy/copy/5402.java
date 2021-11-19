public synchronized void cacheAll(java.util.ArrayList<ws.argo.CLClient.listener.ExpiringService> list) {
    for (ws.argo.CLClient.listener.ExpiringService service : list) {
        cache.put(service.service.getId(), service);
    }
}