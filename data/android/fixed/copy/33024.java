public void notifyAllObservers() {
    if ((observers) == null) {
        observers = new java.util.ArrayList<ca.ualberta.t14.gametrader.AppObserver>();
    }
    for (ca.ualberta.t14.gametrader.AppObserver obs : observers) {
        obs.appNotify(this);
    }
}