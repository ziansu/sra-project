public void onStop() {
    super.onStop();
    if (((searchThread) != null) && (searchThread.isAlive()))
        searchThread.stop();
    
}