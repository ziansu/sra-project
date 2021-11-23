public static synchronized com.gigigo.orchextra.ocm.OCManager getInstance() {
    if ((com.gigigo.orchextra.ocm.OCManager.instance) != null) {
        return com.gigigo.orchextra.ocm.OCManager.instance;
    }
    com.gigigo.orchextra.ocm.OCManager.instance = new com.gigigo.orchextra.ocm.OCManager();
    return com.gigigo.orchextra.ocm.OCManager.instance;
}