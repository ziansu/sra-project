public void update() {
    for (com.example.alykoti.services.ObserverService.WrappedObserver o : observers) {
        if (hasChanges(o.listens)) {
            o.onNext();
        }
    }
}