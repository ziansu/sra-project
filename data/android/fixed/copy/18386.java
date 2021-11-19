private void notifyListeners(com.project.logic.player.PlayerEvent e) {
    java.lang.System.out.println(e);
    java.lang.System.out.println(this.listeners.size());
    for (com.project.logic.player.PlayerListener l : this.listeners)
        l.eventPerformed(e);
    
}