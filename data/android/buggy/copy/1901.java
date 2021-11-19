public void removeSiteListener(ch.entwine.weblounge.kernel.site.SiteServiceListener listener) {
    synchronized(listenersLock) {
        listeners.remove(listener);
    }
}