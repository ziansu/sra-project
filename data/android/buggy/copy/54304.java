public void requestStart() {
    if (running)
        shouldPause = false;
    else
        run();
    
}