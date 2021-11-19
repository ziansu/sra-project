public void addServiceSite(java.lang.String site) {
    java.util.ArrayList<java.lang.String> l = getServiceSites();
    if (!(getServiceSites().contains(site))) {
        l.add(site);
        setServiceSites(l);
    }
}