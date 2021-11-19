public void notifyObservers(java.lang.String data) {
    for (group8.scam.controller.handlers.Observer observer : group8.scam.controller.handlers.Subject.observers) {
        observer.update(data);
    }
}