public void notifyAllObservers() {
    for (ca.ualberta.t14.gametrader.AppObserver obs : observers) {
        obs.appNotify(this);
    }
}