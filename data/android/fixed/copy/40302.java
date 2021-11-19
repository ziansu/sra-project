public void stopConnection() {
    if ((futureClientStarter) != null)
        futureClientStarter.cancel(true);
    
}