public void onGameError(java.lang.String error) {
    for (com.arinerron.forux.events.EventListener eventListener : this.getEventListeners())
        eventListener.onGameError(error);
    
}