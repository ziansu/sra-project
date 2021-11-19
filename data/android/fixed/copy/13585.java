public void addObserver(br.com.apuri.manager.ApuriConnectionManager.ApuriConnectionObserver observer) {
    if ((observer != null) && (!(this.observers.contains(observer))))
        this.observers.add(observer);
    
}