private void notifyListeners(com.project.logic.player.PlayerEvent e) {
    for (com.project.logic.player.PlayerListener l : this.listeners)
        l.eventPerformed(e);
    
}