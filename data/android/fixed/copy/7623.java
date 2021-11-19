public void onPause() {
    if ((manager) != null)
        manager.stop();
    
    paused = true;
    view.showPause();
}