private synchronized void notifyConnectionLost() {
    synchronized(observers) {
        for (br.com.apuri.manager.ApuriConnectionManager.ApuriConnectionObserver observer : observers) {
            if (observer != null)
                observer.didLostConnection();
            
        }
    }
}