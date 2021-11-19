public void removeVolumes(java.util.List<java.net.URI> volumes) {
    if ((_volumes) != null) {
        for (java.net.URI uri : volumes) {
            _volumes.remove(uri.toString());
        }
    }
}